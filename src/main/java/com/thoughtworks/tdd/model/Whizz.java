package com.thoughtworks.tdd.model;

public class Whizz implements FizzBuzzWhizzService {
    @Override
    public boolean isMatch(int number) {
        return number % 7 == 0;
    }

    @Override
    public String getVoice() {
        return "Whizz";
    }
}
