package com.example.ttcm_webbangiay.service;

import com.example.ttcm_webbangiay.entity.BlogEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<BlogEntity> getAllBlog();
}
