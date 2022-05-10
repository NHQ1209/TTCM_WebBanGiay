package com.example.ttcm_webbangiay.service.impl;

import com.example.ttcm_webbangiay.entity.ProductEntity;
import com.example.ttcm_webbangiay.repository.ProductRepository;
import com.example.ttcm_webbangiay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }
}
