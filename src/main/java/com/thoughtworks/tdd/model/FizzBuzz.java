package com.thoughtworks.tdd.model;

public class FizzBuzz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 15 == 0;
    }

    @Override
    public String getVoice() {
        return "FizzBuzz";
    }
}
