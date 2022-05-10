package com.example.ttcm_webbangiay.repository;

import com.example.ttcm_webbangiay.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
