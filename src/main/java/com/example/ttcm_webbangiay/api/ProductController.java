package com.example.ttcm_webbangiay.api;

import com.example.ttcm_webbangiay.entity.ProductEntity;
import com.example.ttcm_webbangiay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProduct(){
        List<ProductEntity> productEntities = productService.getAllProduct();
        return ResponseEntity.ok().body(productEntities);
    }
}
