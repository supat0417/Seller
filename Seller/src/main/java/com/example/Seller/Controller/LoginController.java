package com.example.Seller.Controller;

import com.example.Seller.Entity.LoginEntity;
import com.example.Seller.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping(path = "/seller")
public class LoginController {
    //@Autowired
    //private LoginRepository repo;

    @Autowired
    private LoginService loginService;

    @GetMapping("/armmy")
    public String index()
    {
        return "Hello ARMMY";
    }

    @PostMapping("/login")
    public String checkLogin(){
        return "No data";
    }

    @PostMapping("/login1")
    public String checkLoginRequestBody(@RequestBody LoginEntity user){
        String email = user.getEmail();
        String password = user.getPassword();
        return email;
    }

    @PostMapping("/login2")
    public Map<String, String> checkLoginRequestBody2(@RequestBody LoginEntity user){

        //LoginEntity autenUser = loginService.login(user.getEmail(), user.getPassword());
        LoginEntity autenUser = loginService.login(user.getEmail(), user.getPassword());

        System.out.println(autenUser);
        if(Objects.nonNull(autenUser))
        {
            HashMap<String, String> map = new HashMap<>();
            map.put("email", user.getEmail());
            map.put("password", user.getPassword());
            map.put("status", "success");
            return map;

            //return List.of(autenUser.getEmail(),autenUser.getPassword(), HttpStatus.OK);
            //return "Login Success";
        }else{
            HashMap<String, String> map = new HashMap<>();
            map.put("email", user.getEmail());
            map.put("password", user.getPassword());
            map.put("status", "false");
            return map;
        }

    }

}
