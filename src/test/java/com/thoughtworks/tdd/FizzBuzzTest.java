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
    void test_fizzBuzz_without_special_digit() {
        assertThat(fizz.fizzBuzz(1), is("1"));
        assertThat(fizz.fizzBuzz(2), is("2"));
        assertThat(fizz.fizzBuzz(4), is("4"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_3() {
        assertThat(fizz.fizzBuzz(3), is("Fizz"));
        assertThat(fizz.fizzBuzz(6), is("Fizz"));
        assertThat(fizz.fizzBuzz(9), is("Fizz"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_5() {
        assertThat(fizz.fizzBuzz(5), is("Buzz"));
        assertThat(fizz.fizzBuzz(10), is("Buzz"));
        assertThat(fizz.fizzBuzz(20), is("Buzz"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_7() {
        assertThat(fizz.fizzBuzz(7), is("Whizz"));
        assertThat(fizz.fizzBuzz(14), is("Whizz"));
        assertThat(fizz.fizzBuzz(28), is("Whizz"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_3_and_5() {
        assertThat(fizz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizz.fizzBuzz(30), is("FizzBuzz"));
        assertThat(fizz.fizzBuzz(45), is("FizzBuzz"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_3_and_7() {
        assertThat(fizz.fizzBuzz(21), is("FizzWhizz"));
        assertThat(fizz.fizzBuzz(42), is("FizzWhizz"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_5_and_7() {
        assertThat(fizz.fizzBuzz(35), is("BuzzWhizz"));
        assertThat(fizz.fizzBuzz(70), is("BuzzWhizz"));
    }

    @Test
    void test_fizzBuzz_with_special_digit_3_5_and_7() {
        assertThat(fizz.fizzBuzz(105), is("FizzBuzzWhizz"));
        assertThat(fizz.fizzBuzz(210), is("FizzBuzzWhizz"));
    }
}