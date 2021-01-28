package com.example.Seller.Controller;

import com.example.Seller.Entity.ProductEntity;
import com.example.Seller.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private ProductService productService ;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> GetProduct(){
        return productService.GetProducts();
    }

    @PostMapping
    public ProductEntity AddProduct (@RequestBody ProductEntity productEntity){
        ProductEntity product = productService.AddProducts(productEntity);
        return product ;
    }

    @DeleteMapping(path = "/{product_id}")
    public void DelectProduct (@PathVariable Integer product_id){
        productService.DeleteProduct(product_id);
    }

    @PutMapping(path = "/{product_id}")
    public ProductEntity UpdateProduct(@PathVariable Integer product_id,
                                       @RequestParam String product_name,
                                       @RequestParam String product_picture,
                                       @RequestParam Integer product_price,
                                       @RequestParam Integer product_unit){
        ProductEntity product = productService.UpdateProducts(product_id,product_name,product_picture,product_price,product_unit);
        return product ;

    }

    @PutMapping(path = "updateunit/{product_id}")
    public ProductEntity UpdateUnit(@PathVariable Integer product_id,
                                    @RequestParam Integer product_unit){
        ProductEntity product = productService.UpdateUnits(product_id,product_unit);
        return product;
    }

}
