package com.example.demo.repository;

import com.example.demo.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository <Farm, Long> {
}
