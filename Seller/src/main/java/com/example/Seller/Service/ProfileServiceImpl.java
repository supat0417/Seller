package com.example.Seller.Service;

import com.example.Seller.Entity.ProfileEntity;
import com.example.Seller.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService{
    @Autowired
    public ProfileRepository profileRepository;

    @Override
    public ProfileEntity GetProfileById(String id) {
        //check if id null or emtpy (length<0)
        if(id == null || id.length() < 0)
        {
            //throw new IllegalStateException("Id Is Empty");
            return null;
        }
        // check if id is exists?
        Optional<ProfileEntity> profile = profileRepository.findById(id);
        if(profile.isEmpty())
        {
           // throw new IllegalStateException("Id Does Not Exists");
            return null;
        }
       return profile.get();
    }

    @Override
    public ProfileEntity AddProfile (ProfileEntity profile) {
        //maybe check if email already exists
        return profileRepository.save(profile);
    }

    @Override
    public List<ProfileEntity> GetAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public void DeleteProfileById(String id) {
        profileRepository.deleteById(id);
    }

    @Override
    @Transactional
    public ProfileEntity updateProfileById(String id, String pic, String fname, String lname, String email, Integer tel) {
        ProfileEntity profile = null;
        try{
            profile = profileRepository.findById(id).get();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        if(pic !=null && pic.length()>0)
        {
            profile.setProfile_picture(pic);
        }
        if(fname !=null && fname.length()>0)
        {
            profile.setFirstname(fname);
        }
        if(lname !=null && lname.length()>0)
        {
            profile.setLastname(lname);
        }
        if(email !=null && lname.length()>0)
        {
            profile.setEmail(email);
        }
        if(tel != null)
        {
            profile.setTel(tel);
        }
        return profile;
    }

}
