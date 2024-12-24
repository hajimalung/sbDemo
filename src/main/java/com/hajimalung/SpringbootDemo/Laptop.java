package com.hajimalung.SpringbootDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private String brand = "Default";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void openIde(){
        System.out.println("IDE opened");
    }
}
