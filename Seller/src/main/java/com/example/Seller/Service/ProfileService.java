package com.example.Seller.Service;

import com.example.Seller.Entity.ProfileEntity;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
     Optional<ProfileEntity> GetProfileById(String id);

     void AddProfile(ProfileEntity profile);

     List<ProfileEntity> GetAllProfile();

     void DeleteProfileById(String id);
}
