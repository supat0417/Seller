package com.example.Seller.Repository;

import com.example.Seller.Entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity,String> {
}
