package com.thoughtworks.tdd.model;

public class FizzWhizz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 21 == 0;
    }

    @Override
    public String getVoice() {
        return "FizzWhizz";
    }
}
