package com.example.Seller.Service;

import com.example.Seller.Entity.ProfileEntity;
import com.example.Seller.Entity.RegisterEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public interface RegisterService {

    ResponseEntity<RegisterEntity> saveMerchant(RegisterEntity registerEntity);

    @Service
    class DefaultArticleService implements RegisterService {
        private Map<Integer, RegisterEntity> registerMap = new HashMap<>();

        @Override
        public ResponseEntity<RegisterEntity> saveMerchant(RegisterEntity registerEntity) {
            registerMap.put(registerEntity.getMerchant_id(), registerEntity);

            return null;
        }
    }
}
