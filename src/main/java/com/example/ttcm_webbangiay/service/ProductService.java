package com.example.ttcm_webbangiay.service;

import com.example.ttcm_webbangiay.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<ProductEntity> getAllProduct();
}
