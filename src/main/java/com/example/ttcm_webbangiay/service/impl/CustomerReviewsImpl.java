package com.example.ttcm_webbangiay.service.impl;

import com.example.ttcm_webbangiay.entity.CustomerReviewsEntity;
import com.example.ttcm_webbangiay.repository.CustomerReviewsRepository;
import com.example.ttcm_webbangiay.service.CustomerReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerReviewsImpl implements CustomerReviewsService {
    @Autowired
    CustomerReviewsRepository customerReviewsRepository;
    @Override
    public List<CustomerReviewsEntity> getAllCustomerReviews() {
        return customerReviewsRepository.findAll();
    }
}
