package com.thoughtworks.tdd.model;

public class FizzBuzzWhizz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 105 == 0;
    }

    @Override
    public String getVoice() {
        return "FizzBuzzWhizz";
    }
}
