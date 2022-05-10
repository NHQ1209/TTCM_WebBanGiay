package com.example.ttcm_webbangiay.repository;

import com.example.ttcm_webbangiay.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Integer> {
}
