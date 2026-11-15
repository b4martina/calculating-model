package com.example.demo.service;

import com.example.demo.dto.CalculatorRequest;
import com.example.demo.dto.CalculatorResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService {
    public CalculatorResponse valueCalculator(CalculatorRequest calculatorRequest){
        BigDecimal number1 = calculatorRequest.getNumber1();
        BigDecimal number2= calculatorRequest.getNumber2();

        BigDecimal product = number1.multiply(number2);
        BigDecimal rateOfCalculation = BigDecimal.valueOf(0.5);
        BigDecimal finalProduct= product.multiply(rateOfCalculation);

        return new CalculatorResponse(finalProduct);


    }
}
