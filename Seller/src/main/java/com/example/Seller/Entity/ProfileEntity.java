package com.example.Seller.Entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class ProfileEntity {
    private String merchant_id;
    private String profile_picture;
    private String firstname;
    private String lastname;
    private String email;

    private String tel;
}
