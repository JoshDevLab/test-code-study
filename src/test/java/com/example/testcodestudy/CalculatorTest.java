package com.example.testcodestudy;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void 덧셈_연산_테스트() {
        //given
        long num1 = 2;
        long num2 = 3;
        String operator = "+";

        //when
        Calculator calculator = new Calculator();
        Long result = calculator.calculate(num1, operator, num2);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void 뻴셈_연산_테스트() {
        //given
        long num1 = 4;
        long num2 = 3;
        String operator = "-";

        //when
        Calculator calculator = new Calculator();
        Long result = calculator.calculate(num1, operator, num2);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 곱셈_연산_테스트() {
        //given
        long num1 = 2;
        long num2 = 3;
        String operator = "*";

        //when
        Calculator calculator = new Calculator();
        Long result = calculator.calculate(num1, operator, num2);

        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 나눗셈_연산_테스트() {
        //given
        long num1 = 6;
        long num2 = 3;
        String operator = "/";

        //when
        Calculator calculator = new Calculator();
        Long result = calculator.calculate(num1, operator, num2);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 이상한_연산자가_들어왔다_테스트() {
        //given
        long num1 = 6;
        long num2 = 3;
        String operator = "X";
        Calculator calculator = new Calculator();

        //when
        //then
        Assert.assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}