package com.example.demo.controller;

import com.example.demo.dto.CalculatorRequest;
import com.example.demo.dto.CalculatorResponse;
import com.example.demo.service.CalculatorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
//class 1 in order

/**
 * here i am trying to make a simple calculating program whichcould
 * be an example for further scaling and applications
 */
@RestController
@RequestMapping("/api/calculate")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/multiply")
    public CalculatorResponse calculateValues (@RequestBody CalculatorRequest calculatorRequest){
        calculatorRequest.getNumber1();
        calculatorRequest.getNumber2();
        return calculatorService.valueCalculator(calculatorRequest);
    }
}
