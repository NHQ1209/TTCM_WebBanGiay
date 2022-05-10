package com.example.ttcm_webbangiay.service;

import com.example.ttcm_webbangiay.entity.CategoriesEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriesService {
    List<CategoriesEntity> getAllCategory();
}
