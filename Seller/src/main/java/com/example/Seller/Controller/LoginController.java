package com.example.Seller.Controller;

import com.example.Seller.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/seller")
public class LoginController {
    @Autowired
    private LoginRepository repo;

    @GetMapping("/armmy")
    public String index()
    {
        return "Hello ARMMY";
    }

    @PostMapping("/login")
    public String checkLogin(){
        return "No data";
    }
}
