package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizz;

    @BeforeEach
    void setUp() {
        fizz = new FizzBuzz();
    }

    @Test
    void shouldReturnNumberWhenWithoutSpecialNumber() {
        assertThat(fizz.fizzBuzz(1), is("1"));
        assertThat(fizz.fizzBuzz(2), is("2"));
        assertThat(fizz.fizzBuzz(4), is("4"));
    }

    @Test
    void shouldReturnFizzWhenNumberIsMutipleOf_3() {
        assertThat(fizz.fizzBuzz(3), is("Fizz"));
        assertThat(fizz.fizzBuzz(6), is("Fizz"));
        assertThat(fizz.fizzBuzz(9), is("Fizz"));
    }

    @Test
    void shouldReturnBuzzWhenNumberIsMutipleOf_5() {
        assertThat(fizz.fizzBuzz(5), is("Buzz"));
        assertThat(fizz.fizzBuzz(10), is("Buzz"));
        assertThat(fizz.fizzBuzz(20), is("Buzz"));
    }

    @Test
    void shouldReturnWhizzWhenNumberIsMutipleOf_7() {
        assertThat(fizz.fizzBuzz(7), is("Whizz"));
        assertThat(fizz.fizzBuzz(14), is("Whizz"));
        assertThat(fizz.fizzBuzz(28), is("Whizz"));
    }

    @Test
    void shouldReturnFizzBuzzWhenNumberIsMutipleOf_3_and_5() {
        assertThat(fizz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizz.fizzBuzz(30), is("FizzBuzz"));
        assertThat(fizz.fizzBuzz(45), is("FizzBuzz"));
    }

    @Test
    void shouldReturnFizzWhizzWhenNumberIsMutipleOf_3_and_7() {
        assertThat(fizz.fizzBuzz(21), is("FizzWhizz"));
        assertThat(fizz.fizzBuzz(42), is("FizzWhizz"));
    }

    @Test
    void shouldReturnBuzzWhizzWhenNumberIsMutipleOf_5_and_7() {
        assertThat(fizz.fizzBuzz(35), is("BuzzWhizz"));
        assertThat(fizz.fizzBuzz(70), is("BuzzWhizz"));
    }

    @Test
    void shouldReturnFizzBuzzWhizzWhenNumberIsMutipleOf_3_5_and_7() {
        assertThat(fizz.fizzBuzz(105), is("FizzBuzzWhizz"));
        assertThat(fizz.fizzBuzz(210), is("FizzBuzzWhizz"));
    }
}