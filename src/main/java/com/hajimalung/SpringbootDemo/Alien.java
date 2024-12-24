package com.hajimalung.SpringbootDemo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    public void code(){
        System.out.println("Hello Alien, coding on cloud ide...");
    }
    public void code(Laptop laptop){
        laptop.setBrand("Alien brand");
        laptop.openIde();
        System.out.println("Hello Alien, coding on "+ laptop.getBrand() +"...");
    }
}
