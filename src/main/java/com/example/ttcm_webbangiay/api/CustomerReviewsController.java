package com.example.ttcm_webbangiay.api;

import com.example.ttcm_webbangiay.entity.CustomerReviewsEntity;
import com.example.ttcm_webbangiay.entity.ProductEntity;
import com.example.ttcm_webbangiay.service.CustomerReviewsService;
import com.example.ttcm_webbangiay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customerreviews")
public class CustomerReviewsController {
    @Autowired
    CustomerReviewsService customerReviewsService;

    @GetMapping
    public ResponseEntity<?> getAllCustomerReviews(){
        List<CustomerReviewsEntity> customerReviewsEntities = customerReviewsService.getAllCustomerReviews();
        return ResponseEntity.ok().body(customerReviewsEntities);
    }
}
