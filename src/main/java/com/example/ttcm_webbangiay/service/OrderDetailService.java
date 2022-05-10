package com.example.ttcm_webbangiay.service;

import com.example.ttcm_webbangiay.entity.OrderDetailEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDetailService {
    List<OrderDetailEntity> getAllOrderDetail();

}
