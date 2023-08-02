package com.example.testcodestudy;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.*;


public class CalculationRequestReaderTest {

    @Test
    public void System_in으로_데이터를_읽어들일_수_있다() {
        //given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        //when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculationRequest result = calculationRequestReader.read();

        //then
        assertThat(2L).isEqualTo(result.getNum1());
        assertThat("+").isEqualTo(result.getOperator());
        assertThat(3L).isEqualTo(result.getNum2());
    }
}