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
}