package com.smalaca.tddwebiner;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int DIVIDABLE_BY_3_AND_5 = 15;
    private static final int DIVIDABLE_BY_5 = 10;
    private static final int DIVIDABLE_BY_3 = 6;
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final int NOT_DIVIDABLE_BY_3_NOR_5 = 2;
    private static final String NOT_DIVIDABLE_BY_3_NOR_5_STRING_REPRESENTATION = "2";

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnStringRepresentationOfNumber() {
        String result = fizzBuzz.play(NOT_DIVIDABLE_BY_3_NOR_5);

        assertThat(result).isEqualTo(NOT_DIVIDABLE_BY_3_NOR_5_STRING_REPRESENTATION);
    }

    @Test
    public void shouldReturnFizzIfDividableBy3Received() {
        String result = fizzBuzz.play(DIVIDABLE_BY_3);

        assertThat(result).isEqualTo(FIZZ);
    }

    @Test
    public void shouldReturnBuzzIfDividableBy5Received() {
        String result = fizzBuzz.play(DIVIDABLE_BY_5);

        assertThat(result).isEqualTo(BUZZ);
    }

    @Test
    public void shouldReturnFizzBuzzInCaseOfNumberDivideableBy3And5() {
        String result = fizzBuzz.play(DIVIDABLE_BY_3_AND_5);

        assertThat(result).isEqualTo(FIZZ_BUZZ);
    }
}
