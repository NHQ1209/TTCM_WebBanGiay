package com.example.ttcm_webbangiay.service.impl;

import com.example.ttcm_webbangiay.entity.BlogEntity;
import com.example.ttcm_webbangiay.repository.BlogRepository;
import com.example.ttcm_webbangiay.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;
    @Override
    public List<BlogEntity> getAllBlog(){
        return blogRepository.findAll();
    }
}
