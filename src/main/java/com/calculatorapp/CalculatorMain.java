package com.calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorMain {
        static Calculator calc = new Calculator();

    public static void addNums() {
        for (int i = 0; i < 10000000; i++) {
            calc.add(i, i + 1);
        }
    }

    public static void subtractNums() {
        for (int i = 10000000; i > 0 ; i--) {
            calc.subtract(i, i - 1);
        }
    }

    public static void multiplyNums() {
        for (int i = 0; i < 10000000; i++) {
            calc.multiply(i, i + 1);
        }
    }

    public static void squareNums() {
        for (int i = 0; i < 10000000; i++) {
            calc.square(i);
        }
    }

    public static void squareRootNums() {
        for (int i = 0; i < 10000000; i++) {
            calc.squareRoot(i);
        }
    }


    public static void main(String[] args){

        SpringApplication.run(CalculatorMain.class, args);

        addNums();
        subtractNums();
        multiplyNums();
        squareNums();
        squareRootNums();
        System.out.println("Completed batch computation.");
    }
}
