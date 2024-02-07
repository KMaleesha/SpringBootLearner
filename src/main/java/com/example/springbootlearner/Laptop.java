package com.example.springbootlearner;

import org.springframework.stereotype.Component;

@Component("Lap")
public class Laptop {
    private int lid;
    private String brand;

    public void setLid(int lid){
        this.lid = lid;
    }
    public int getLid(){
        return lid;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
