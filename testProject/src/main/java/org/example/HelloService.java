package org.example;

import java.util.Optional;

public class HelloService {

    public static final String FALLBACK_NAME = "world";

    String prepareGreating(String name) {
        return "Hello " + Optional.ofNullable(name).orElse(FALLBACK_NAME) + "!";
    }
}
