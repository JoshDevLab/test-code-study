package com.example.testcodestudy;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class CalculationRequestTest {

    @Test
    public void 유효한_숫자를_파싱할_수_있다() {
        //given
        String[] parts = new String[]{"2", "+", "3"};

        //when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        //then
        Assertions.assertThat(calculationRequest.getNum1()).isEqualTo(2);
        Assertions.assertThat(calculationRequest.getOperator()).isEqualTo("+");
        Assertions.assertThat(calculationRequest.getNum2()).isEqualTo(3);

    }

    @Test
    public void 세자리_숫자가_넘어가는_유효한_숫자를_파싱할_수_있다() {
        //given
        String[] parts = new String[]{"232", "+", "3333"};

        //when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        //then
        Assertions.assertThat(calculationRequest.getNum1()).isEqualTo(232);
        Assertions.assertThat(calculationRequest.getOperator()).isEqualTo("+");
        Assertions.assertThat(calculationRequest.getNum2()).isEqualTo(3333);

    }

    @Test
    public void 유효한_길이의_숫자가_들어오지_않으면_에러를_던진다() {
        //given
        String[] parts = new String[]{"232", "+"};

        //when
        //then
        Assert.assertThrows(BadRequestException.class, () -> {
            new CalculationRequest(parts);
        });
    }
}