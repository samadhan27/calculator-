package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Calculator;
import com.demo.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculaorController {

	@Autowired
	private CalculatorService calculatorService;

	@PostMapping("/performOperation")
	public Calculator performOperation(@RequestBody Calculator calculator) {

		Calculator calculator1 = calculatorService.performOperation(calculator);
		
		return calculator1;

	}

}
