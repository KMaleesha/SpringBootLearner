package com.example.springbootlearner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    private int aid;
    private String aname;
    private String tech;

    @Autowired
    @Qualifier("Lap")
    private Laptop laptop;

    public Alien(){
        super();
        System.out.println("Object Created");
    }

    public void setAid(int aid){
        this.aid = aid;
    }
    public int getAid(){
        return aid;
    }
    public void setAname(String aname){
        this.aname = aname;
    }
    public String getAname(){
        return aname;
    }
    public void setTech(String tech){
        this.tech = tech;
    }
    public String getTech(){
        return tech;
    }
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
    public Laptop getLaptop(){
        return laptop;
    }

    public void show(){
        System.out.println("In Show");
        laptop.compile();
    }
}
