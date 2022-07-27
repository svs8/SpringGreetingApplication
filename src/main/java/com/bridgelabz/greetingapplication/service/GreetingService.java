package com.bridgelabz.greetingapplication.service;

import com.bridgelabz.greetingapplication.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
    public class GreetingService implements IGreetingService {

        private static final String template = "Hello world";
        private final AtomicLong counter = new AtomicLong();


        @Override
        public Greeting sayHello() {
            return new Greeting(counter.incrementAndGet(), String.format(template));
        }

    }





