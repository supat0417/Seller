package com.example.Seller.Repository;

import com.example.Seller.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity,Integer> {
}
