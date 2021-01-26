package com.example.Seller.Controller;

import com.example.Seller.Entity.RegisterEntity;
import com.example.Seller.Repository.RegisterRepository;
import com.example.Seller.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
public class RegisterController {
    @Autowired
    private RegisterRepository repository;
    private RegisterEntity registerEntity;

    //@PostMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    @PutMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    public RegisterEntity registerSeller(@RequestBody RegisterEntity request){
        System.out.println("Response : " + request);
        System.out.println("Response A : " + request.getMerchant_email());
        //System.out.println("Response B : " + registerEntity.getMerchant_email());
        //if(request.getMerchant_email() != registerEntity.getMerchant_email()){
            System.out.println("Success");
            registerEntity = repository.save(request);
        //} else {
        //    System.out.println("Failed");
        //}

        return registerEntity;
    }
}
