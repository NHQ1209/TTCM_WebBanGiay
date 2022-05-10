package com.example.ttcm_webbangiay.api;

import com.example.ttcm_webbangiay.entity.BlogEntity;
import com.example.ttcm_webbangiay.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping
    public ResponseEntity<?> getAllProduct(){
        List<BlogEntity> blogEntities = blogService.getAllBlog();
        return ResponseEntity.ok().body(blogEntities);
    }
}
