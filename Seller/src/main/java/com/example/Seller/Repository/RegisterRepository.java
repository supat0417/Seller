package com.example.Seller.Repository;

import com.example.Seller.Entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer> {
    public RegisterEntity findByEmail(String email);
}
