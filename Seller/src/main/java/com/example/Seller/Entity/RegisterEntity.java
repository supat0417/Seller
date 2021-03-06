package com.example.Seller.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "merchant")
public class RegisterEntity {
    @Id @GeneratedValue
    private Integer merchant_id;

    //@JsonProperty("merchant_name")
    private String merchant_name;

    //@JsonProperty("merchant_email")
    @Column(unique = true)
    private String email;

    //@JsonProperty("merchant_password")
    private String merchant_password;

    //@JsonProperty("merchant_tel")
    private String merchant_tel;

    //@JsonProperty("merchant_account_no")
    private String merchant_account_no;

    //@JsonProperty("merchant_account_name")
    private String merchant_account_name;

    //@JsonProperty("merchant_bank")
    private String merchant_bank;

    //@JsonProperty("merchant_prompt_pay")
    private String merchant_prompt_pay;

//    @JsonProperty("merchant_status")
//    private String merchant_status;
}
