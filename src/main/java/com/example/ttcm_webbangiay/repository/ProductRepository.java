package com.example.ttcm_webbangiay.repository;

import com.example.ttcm_webbangiay.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
