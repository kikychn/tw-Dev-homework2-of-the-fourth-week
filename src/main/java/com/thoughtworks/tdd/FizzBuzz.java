package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(i);
    }
}
