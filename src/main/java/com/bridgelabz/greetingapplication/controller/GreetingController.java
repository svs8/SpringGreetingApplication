package com.bridgelabz.greetingapplication.controller;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;
    private static final String template ="Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue="World")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
    @GetMapping("greeting/service")
    public Greeting greeting() {
            Greeting response = greetingService.sayHello();
            return response;
        }

    }


