package com.example.ttcm_webbangiay.api;

import com.example.ttcm_webbangiay.entity.CustomerEntity;
import com.example.ttcm_webbangiay.entity.ProductEntity;
import com.example.ttcm_webbangiay.service.CustomerService;
import com.example.ttcm_webbangiay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity<?> getAllCustomer(){
        List<CustomerEntity> customerEntities = customerService.getAllCustomer();
        return ResponseEntity.ok().body(customerEntities);
    }
}
