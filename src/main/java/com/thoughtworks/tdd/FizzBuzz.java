package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
