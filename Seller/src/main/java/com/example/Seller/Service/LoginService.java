package com.example.Seller.Service;

import com.example.Seller.Entity.LoginEntity;
import com.example.Seller.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public LoginEntity login(String email,String password){
        LoginEntity user = repo.findByEmailAndPassword(email, password);
        //LoginEntity user = repo.findByEmail(email);
        return user;
    }

}
