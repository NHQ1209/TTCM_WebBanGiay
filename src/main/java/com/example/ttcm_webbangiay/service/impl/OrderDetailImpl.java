package com.example.ttcm_webbangiay.service.impl;

import com.example.ttcm_webbangiay.entity.OrderDetailEntity;
import com.example.ttcm_webbangiay.repository.OrderDetailRepository;
import com.example.ttcm_webbangiay.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailImpl implements OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetailEntity> getAllOrderDetail() {
        return orderDetailRepository.findAll();
    }
}
