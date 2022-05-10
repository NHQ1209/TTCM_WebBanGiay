package com.example.ttcm_webbangiay.service.impl;

import com.example.ttcm_webbangiay.entity.CategoriesEntity;
import com.example.ttcm_webbangiay.repository.CategoriesReposity;
import com.example.ttcm_webbangiay.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesImpl implements CategoriesService {
    @Autowired
    CategoriesReposity categoriesReposity;
    @Override
    public List<CategoriesEntity> getAllCategory() {
        return categoriesReposity.findAll();
    }
}
