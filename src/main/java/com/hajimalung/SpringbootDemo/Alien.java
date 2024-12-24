package com.hajimalung.SpringbootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code(){
        this.laptop.setBrand("Apple");
        this.laptop.openIde();
        System.out.println("Hello Alien, coding on "+ this.laptop.getBrand() +"...");
    }
}
