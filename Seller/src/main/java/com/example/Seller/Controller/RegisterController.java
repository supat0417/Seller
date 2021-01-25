package com.example.Seller.Controller;

import com.example.Seller.Entity.RegisterEntity;
import com.example.Seller.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    //@PostMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    @PutMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterEntity> registerSeller(@RequestBody RegisterEntity request){
        //registerService.saveMerchant(request);
        return registerService.saveMerchant(request);
    }
}
