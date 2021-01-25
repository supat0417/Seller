package com.example.Seller.Controller;

import com.example.Seller.Entity.ProfileEntity;
import com.example.Seller.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    public ProfileService profileService;

    @GetMapping(path = "{id}")
    public Optional<ProfileEntity> GetProfileById(@PathVariable String id)
    {
        return profileService.GetProfileById(id);
    }

    @GetMapping("/")
    public List<ProfileEntity> GetAllProfile()
    {
        return profileService.GetAllProfile();
    }

    @PostMapping()
    public void AddProfile(@RequestBody ProfileEntity profile)
    {
         profileService.AddProfile(profile);
    }

    @DeleteMapping(path = "{id}")
    public void DeleteProfileById(@PathVariable String id){
        profileService.DeleteProfileById(id);
    }


}
