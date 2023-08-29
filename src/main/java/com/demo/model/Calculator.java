package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="calculator")
@Getter
@Setter
public class Calculator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double operand1;
	private double operand2;
	private String  operator; 
	private double result;
	

}
