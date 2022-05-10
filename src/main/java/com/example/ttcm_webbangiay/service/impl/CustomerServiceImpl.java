package com.example.ttcm_webbangiay.service.impl;

import com.example.ttcm_webbangiay.entity.CustomerEntity;
import com.example.ttcm_webbangiay.repository.CustomerRepository;
import com.example.ttcm_webbangiay.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }
}
