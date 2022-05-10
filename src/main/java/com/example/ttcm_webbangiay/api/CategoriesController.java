package com.example.ttcm_webbangiay.api;

import com.example.ttcm_webbangiay.entity.CategoriesEntity;
import com.example.ttcm_webbangiay.entity.ProductEntity;
import com.example.ttcm_webbangiay.service.CategoriesService;
import com.example.ttcm_webbangiay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    @Autowired
    CategoriesService categoriesService;

    @GetMapping
    public ResponseEntity<?> getAllCategories(){
        List<CategoriesEntity> categoriesEntities = categoriesService.getAllCategory();
        return ResponseEntity.ok().body(categoriesEntities);
    }

}
