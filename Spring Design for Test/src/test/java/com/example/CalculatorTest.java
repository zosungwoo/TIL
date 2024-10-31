package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long n1 = 2, n2 = 3;
        String operator = "+";
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(n1, operator, n2);

        // then
//        assertEquals(5, result);  // junit assertion
        assertThat(result).isEqualTo(5);  // assertj assertion
    }

    @Test
    public void 뺼셈_연산을_할_수_있다() {
        // given
        long n1 = 2, n2 = 3;
        String operator = "-";
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(n1, operator, n2);

        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void 곱셈_연산을_할_수_있다() {
        // given
        long n1 = 2, n2 = 3;
        String operator = "*";
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(n1, operator, n2);

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 나눗셈_연산을_할_수_있다() {
        // given
        long n1 = 6, n2 = 3;
        String operator = "/";
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(n1, operator, n2);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 잘못된_연산자가_들어올_경우_에러가_난다() {
        // given
        long n1 = 6, n2 = 3;
        String operator = "x";
        Calculator calculator = new Calculator();

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(n1, operator, n2);
        });
    }
}
