package com.example.ttcm_webbangiay.service;

import com.example.ttcm_webbangiay.entity.CustomerEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<CustomerEntity> getAllCustomer();
}
