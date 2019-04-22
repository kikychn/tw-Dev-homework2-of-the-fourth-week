package com.thoughtworks.tdd;

public class Game {
    public String play(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        if (i % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (i % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (i % 7 == 0) {
            stringBuilder.append("Whizz");
        }
        return stringBuilder.length() > 0 ? stringBuilder.toString() : String.valueOf(i);
    }
}
