package com.example.Seller.Service;

import com.example.Seller.Entity.ProductEntity;
import com.example.Seller.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> GetProducts() {
        return productRepository.findAll();
    }

    public void AddProducts(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    public void DeleteProduct(Integer product_id) {
        productRepository.deleteById(product_id);
    }

    public void UpdateProducts(Integer product_id, String product_name, String product_picture, Integer product_price, Integer product_unit) {
        ProductEntity productEntity = productRepository.findById(product_id).orElseThrow(() -> new IllegalStateException(
                "student with id" + product_id + "does not exist" ));

        productEntity.setProduct_name(product_name);
        productEntity.setProduct_picture(product_picture);
        productEntity.setProduct_price(product_price);
        productEntity.setProduct_unit(product_unit);

        productRepository.save(productEntity);
    }

    public void UpdateUnits(Integer product_id, Integer product_unit) {
        ProductEntity productEntity = productRepository.findById(product_id).orElseThrow(() -> new IllegalStateException(
                "student with id" + product_id + "does not exist" ));

        productEntity.setProduct_unit(product_unit);

        productRepository.save(productEntity);
    }
}
