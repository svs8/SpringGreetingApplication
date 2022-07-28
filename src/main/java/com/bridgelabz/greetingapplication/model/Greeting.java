package com.bridgelabz.greetingapplication.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "GREETING")
public class Greeting {
    @Id
    @Column(name="id", nullable=false)
        private final long id;
        private String content;

    public Greeting(long id, String content) {
            this.id = id;
            this.content = content;
        }

    public Greeting() {
        id=0;
        content="";
    }
    public void setContent(String content){
        this.content=content;
    }
}
