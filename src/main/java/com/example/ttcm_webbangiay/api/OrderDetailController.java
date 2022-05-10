package com.example.ttcm_webbangiay.api;

import com.example.ttcm_webbangiay.entity.OrderDetailEntity;
import com.example.ttcm_webbangiay.entity.ProductEntity;
import com.example.ttcm_webbangiay.service.OrderDetailService;
import com.example.ttcm_webbangiay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orderdetail")
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;

    @GetMapping
    public ResponseEntity<?> getAllOrderDetail(){
        List<OrderDetailEntity> orderDetailEntities = orderDetailService.getAllOrderDetail();
        return ResponseEntity.ok().body(orderDetailEntities);
    }
}
