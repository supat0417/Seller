package com.example.Seller.Repository;

import com.example.Seller.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity,Integer> {
    public LoginEntity findByEmail(String email);
    public LoginEntity findByEmailAndPassword(String email , String password);
}
