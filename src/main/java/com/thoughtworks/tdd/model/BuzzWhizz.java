package com.thoughtworks.tdd.model;

public class BuzzWhizz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 35 == 0;
    }

    @Override
    public String getVoice() {
        return "BuzzWhizz";
    }
}
