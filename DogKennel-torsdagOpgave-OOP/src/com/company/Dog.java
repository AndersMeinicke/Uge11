package com.company;

import java.util.ArrayList;

public class Dog {
    private String name;
    private ArrayList<Dog> offSpring = new ArrayList<>();
    private boolean isHungry;
    private Owner owner;
    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public void setOwner(String ownerName) {
        owner = new Owner(ownerName);
    }
    public String feedDog(){
        if(isHungry == true){
            return name + " is no longer hungry";
        }
        else{
            return name + " isn't hungry";
        }
    }
    public void setOffSpring(String thePuppy){
        Dog puppy = new Dog(thePuppy, true);
        offSpring.add(puppy);
    }
    public ArrayList<Dog> getOffSpring(){
        return offSpring;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }
}
