package com.thoughtworks.tdd;

import com.thoughtworks.tdd.model.*;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<FizzBuzzWhizzService> services;

    public Game() {
        this.services = new ArrayList<>();
        services.add(new FizzWhizz());
        services.add(new FizzBuzz());
        services.add(new Fizz());
        services.add(new Buzz());
        services.add(new Whizz());
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
