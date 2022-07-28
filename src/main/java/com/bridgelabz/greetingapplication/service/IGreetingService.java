package com.bridgelabz.greetingapplication.service;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {

    Greeting sayHello();
    String sayPostHello(User user);

    Greeting addGreeting(User user);

    Optional<Greeting> sayHelloById(int id);

    List<Greeting> showAll();
}


