package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.CalculatorException;
import com.demo.model.Calculator;
import com.demo.repository.CalculatorRepo;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Autowired
	private CalculatorRepo calculatorRepo;

	@Override
	public Calculator performOperation(Calculator calculator) {
		double operand1 = calculator.getOperand1();
		double operand2 = calculator.getOperand2();
		String operator = calculator.getOperator();

		double result = 0;

		switch (operator) {

		case "+":
			result = operand1 + operand2;
			break;
		case "-":
			result = operand1 - operand2;
			break;
		case "*":
			result = operand1 * operand2;
			break;
		case "/":
			if (operand2 != 0) {
				result = operand1 / operand2;
			} else {
				throw new CalculatorException("Can not divide by Zero");
			}
			break;
		default:
			throw new CalculatorException("You Entered Invalid Operator");
		}
		calculator.setResult(result);
		calculatorRepo.save(calculator);
		
		return calculator;
	}

}
