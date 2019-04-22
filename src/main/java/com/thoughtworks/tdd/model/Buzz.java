package com.thoughtworks.tdd.model;

public class Buzz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getVoice() {
        return "Buzz";
    }
}
