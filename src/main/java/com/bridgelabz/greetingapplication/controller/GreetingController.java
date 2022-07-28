package com.bridgelabz.greetingapplication.controller;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;
import com.bridgelabz.greetingapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("greeting/service")
    public Greeting greeting() {
        Greeting response = greetingService.sayHello();
        return response;
    }

    @PostMapping("/greeting01")
    public String greeting01(@RequestBody User user) {
        String newUser;
        newUser = greetingService.sayPostHello(user);
        return newUser;

    }


    @GetMapping(value = {"", "/"})
    public Greeting greeting02(@RequestParam(value = "fname") String fname,@RequestParam(value = "lname") String lname){
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/show/{id}")
    public Optional<Greeting> sayHelloById(@PathVariable int id) {
        Optional<Greeting> response = greetingService.sayHelloById(id);
        return response;
    }

    @GetMapping("/show")
    public List<Greeting> showAll() {
        List<Greeting> response = greetingService.showAll();
        return response;
    }
}


