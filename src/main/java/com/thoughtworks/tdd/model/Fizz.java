package com.thoughtworks.tdd.model;

public class Fizz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getVoice() {
        return "Fizz";
    }
}
