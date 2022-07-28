package com.bridgelabz.greetingapplication.repository;


import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpringRepo extends JpaRepository<Greeting, Long> {

}
