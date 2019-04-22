package com.thoughtworks.tdd;

import com.thoughtworks.tdd.model.Buzz;
import com.thoughtworks.tdd.model.Fizz;
import com.thoughtworks.tdd.model.FizzBuzzWhizzService;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<FizzBuzzWhizzService> services;

    public Game() {
        this.services = new ArrayList<>();
        services.add(new Fizz());
        services.add(new Buzz());
    }

    public String play(int number) {
        for (FizzBuzzWhizzService service : services) {
            if (service.isMatch(number)) {
                return service.getVoice();
            }
        }
        return String.valueOf(number);
    }
}
