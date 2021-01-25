package com.example.Seller.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PaymentEntity {
    @Id
    private String accountno;
    private String accountname;
    private String bank;
}
