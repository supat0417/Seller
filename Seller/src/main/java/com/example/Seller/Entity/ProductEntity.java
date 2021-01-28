package com.example.Seller.Entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    private String product_name;
    private String product_picture;
    private Integer product_price;
    private Integer product_unit;
    private String product_status;

    public String getProduct_status() {
        if (product_unit <= 0){ product_status = "Out of stock"; }
        else { product_status = "In stock"; }

        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }
}
