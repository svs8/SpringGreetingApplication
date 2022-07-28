package com.bridgelabz.greetingapplication.service;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;
import com.bridgelabz.greetingapplication.repository.SpringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
    public class GreetingService implements IGreetingService {

    private static final String template = "Hello";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    SpringRepo springRepository;

    @Override
    public Greeting sayHello() {
        return new Greeting(counter.incrementAndGet(), String.format(template));
    }

    public String sayPostHello(User user) {
        return "Hello Mr  " + user.getFirstName() + " " + user.getLastName() + "!!!";
    }


    @Override
    public Greeting addGreeting(User user) {
        String message = template + user.getFirstName() + " " + user.getLastName() + "!!!";
        return springRepository.save(new Greeting(counter.incrementAndGet(), message));
    }
    @Override
    public Optional<Greeting> sayHelloById(int id) {
        return springRepository.findById(Long.valueOf(id));
    }

    public List<Greeting> showAll() {
        return springRepository.findAll();
    }

}





