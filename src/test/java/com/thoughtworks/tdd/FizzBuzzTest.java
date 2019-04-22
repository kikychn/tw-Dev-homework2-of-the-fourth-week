package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GameTest {
    public Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void shouldReturnNumberWhenWithoutSpecialNumber() {
        assertThat(game.play(1), is("1"));
        assertThat(game.play(2), is("2"));
        assertThat(game.play(4), is("4"));
    }

    @Test
    void shouldReturnFizzWhenNumberIsMutipleOf_3() {
        assertThat(game.play(3), is("Fizz"));
        assertThat(game.play(6), is("Fizz"));
        assertThat(game.play(9), is("Fizz"));
    }

    @Test
    void shouldReturnBuzzWhenNumberIsMutipleOf_5() {
        assertThat(game.play(5), is("Buzz"));
        assertThat(game.play(10), is("Buzz"));
        assertThat(game.play(20), is("Buzz"));
    }

    @Test
    void shouldReturnWhizzWhenNumberIsMutipleOf_7() {
        assertThat(game.play(7), is("Whizz"));
        assertThat(game.play(14), is("Whizz"));
        assertThat(game.play(28), is("Whizz"));
    }

    @Test
    void shouldReturnFizzBuzzWhenNumberIsMutipleOf_3_and_5() {
        assertThat(game.play(15), is("FizzBuzz"));
        assertThat(game.play(30), is("FizzBuzz"));
        assertThat(game.play(45), is("FizzBuzz"));
    }

    @Test
    void shouldReturnFizzWhizzWhenNumberIsMutipleOf_3_and_7() {
        assertThat(game.play(21), is("FizzWhizz"));
        assertThat(game.play(42), is("FizzWhizz"));
    }

    @Test
    void shouldReturnBuzzWhizzWhenNumberIsMutipleOf_5_and_7() {
        assertThat(game.play(35), is("BuzzWhizz"));
        assertThat(game.play(70), is("BuzzWhizz"));
    }

    @Test
    void shouldReturnFizzBuzzWhizzWhenNumberIsMutipleOf_3_5_and_7() {
        assertThat(game.play(105), is("FizzBuzzWhizz"));
        assertThat(game.play(210), is("FizzBuzzWhizz"));
    }
}