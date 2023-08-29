package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Calculator;

@Repository
public interface CalculatorRepo extends JpaRepository<Calculator, Integer> {

}
