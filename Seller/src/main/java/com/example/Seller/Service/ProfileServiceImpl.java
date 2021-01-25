package com.example.Seller.Service;

import com.example.Seller.Entity.ProfileEntity;
import com.example.Seller.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService{
    @Autowired
    public ProfileRepository profileRepository;

    @Override
    public Optional<ProfileEntity> GetProfileById(String id) {
        //check if id null or emtpy (length<0)
        if(id == null || id.length() < 0)
        {
            throw new IllegalStateException("Id is Empty");
        }
        // check if id is exists?
        Optional<ProfileEntity> profile = profileRepository.findById(id);
        if(profile.isEmpty())
        {
            throw new IllegalStateException("Id Does not exists");
        }
       return profile;
    }

    @Override
    public void AddProfile(ProfileEntity profile) {
        //maybe check if email already exists
        profileRepository.save(profile);
    }

    @Override
    public List<ProfileEntity> GetAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public void DeleteProfileById(String id) {
        profileRepository.deleteById(id);
    }
}
