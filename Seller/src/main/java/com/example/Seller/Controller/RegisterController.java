package com.example.Seller.Controller;


import com.example.Seller.Entity.RegisterEntity;
import com.example.Seller.Repository.RegisterRepository;
import com.example.Seller.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class RegisterController {
    @Autowired
    private RegisterRepository repository;

    private RegisterEntity registerEntity;

    @Autowired
    private RegisterService service;

    @GetMapping(value = "/getRegister", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RegisterEntity> getRegister() {
        List<RegisterEntity> allUser = repository.findAll();
        return allUser;
    }

    @PutMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterEntity> registerSeller(@RequestBody RegisterEntity request){
        System.out.println("Response : " + request);
        String email = request.getEmail();
        System.out.println("Response A : " + email);
        RegisterEntity findEmail = repository.findByEmail(email);
        String find = String.valueOf(findEmail);
        System.out.println("Response B : " + findEmail + "\n string >> " + find);

        if(email != null){
            if(findEmail != null){
                String mail = findEmail.getEmail();
                System.out.println("Response C : " + mail);
                if(!email.equals(mail)) {
                    System.out.println("Success");
                    registerEntity = repository.save(request);
                } else {
                    System.out.println("Failed");
                    return ResponseEntity.notFound().build();
                }
            } else {
                System.out.println("Success");
                registerEntity = repository.save(request);
            }
        } else {
            System.out.println("Failed");
            return ResponseEntity.notFound().build();

        }

        return ResponseEntity.ok(registerEntity);
    }
}
