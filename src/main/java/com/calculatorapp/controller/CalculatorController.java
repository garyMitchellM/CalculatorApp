package com.calculatorapp.controller;

import ch.qos.logback.classic.Logger;
import com.calculatorapp.Calculator;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(CalculatorController.class);
    Calculator calc = new Calculator();

    //Common logging message types:
    //Info - general information about the application's progress and important events.
    //Debug - useful for debugging an application during development
    //Warn - event that may not immediately cause a failure but could lead to problems in the future.
    //Error - a serious problem that has occurred preventing a specific operation or component from working correctly.
    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        int result = calc.multiply(a, b);
        logger.info("Multiplying {} * {} = {}", a, b, result);
        return result;
    }

    @GetMapping("/squareRoot")
    public double squareRoot(@RequestParam("a") int a) {
        double result = calc.squareRoot(a);
        logger.info("Calculating square root of {} = {}", a, result);
        return result;
    }


}