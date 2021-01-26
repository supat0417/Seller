package com.example.Seller.Entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Embeddable
public class PaymentEntity {

    private String accountno;
    private String accountname;
    private String bank;
}
