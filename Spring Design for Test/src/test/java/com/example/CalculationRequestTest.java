package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

public class CalculationRequestTest {

    @Test
    public void 유효한_숫자를_파싱할_수_있다() {
        // given
        String[] parts = {"3", "+", "4"};

        // when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        // then
        assertThat(calculationRequest.getN1()).isEqualTo(3);
        assertThat(calculationRequest.getOperator()).isEqualTo("+");
        assertThat(calculationRequest.getN2()).isEqualTo(4);
    }

    @Test
    public void 세자리_넘어가는_유효한_숫자를_파싱할_수_있다() {
        // given
        String[] parts = {"333", "+", "444"};

        // when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        // then
        assertThat(calculationRequest.getN1()).isEqualTo(333);
        assertThat(calculationRequest.getOperator()).isEqualTo("+");
        assertThat(calculationRequest.getN2()).isEqualTo(444);
    }

    @Test
    public void 유효하지_않은_길이의_배열이_들어오면_에러를_던진다() {
        // given
        String[] parts = {"333", "+"};

        // when
        // then
        assertThrows(BadRequestException.class, () -> {
            new CalculationRequest(parts);
        });
    }

    @Test
    public void 유효하지_않은_연산자가_들어오면_에러를_던진다() {
        // given
        String[] parts = {"333", "x", "444"};

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculationRequest(parts);
        });
    }

    @Test
    public void 유효하지_않은_길이의_연산자가_들어오면_에러를_던진다() {
        // given
        String[] parts = {"333", "+-", "444"};

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculationRequest(parts);
        });
    }
}
