package com.example.testcodestudy;

public class Calculator {

    public Long calculate(Long num1, String operator, Long num2) {
        long answer = 0;
        switch (operator) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        return answer;
    }


}
