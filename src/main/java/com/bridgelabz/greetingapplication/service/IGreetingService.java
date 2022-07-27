package com.bridgelabz.greetingapplication.service;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;

public interface IGreetingService {

    Greeting sayHello();
    String sayPostHello(User user);
    }


