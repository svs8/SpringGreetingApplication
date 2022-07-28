package com.bridgelabz.greetingapplication.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;

//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }



    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        String str = (firstName != null)? firstName+" ":"";
//        str += (lastName != null)? lastName:"";
//        return str.trim();
//    }

}
