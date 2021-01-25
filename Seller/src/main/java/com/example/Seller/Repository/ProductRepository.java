package com.example.Seller.Repository;

import com.example.Seller.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductEntity,Integer> {
}
