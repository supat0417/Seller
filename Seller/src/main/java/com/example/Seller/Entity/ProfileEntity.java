package com.example.Seller.Entity;

import com.example.Seller.Utils.StringPrefixSequenceIdGenerator;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Data
@Entity
@Table(name = "Profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "profile_seq")
    @GenericGenerator(
            name = "profile_seq",
            strategy = "com.example.Seller.Utils.StringPrefixSequenceIdGenerator",
            parameters = {
                    @Parameter(name = StringPrefixSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @Parameter(name = StringPrefixSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "C_"),
                    @Parameter(name = StringPrefixSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })
    private String merchant_id;
    private String profile_picture;
    private String firstname;
    private String lastname;
    private String email;
    @OneToOne(cascade = {CascadeType.ALL})
    private PaymentEntity payment;
    private String tel;
}
