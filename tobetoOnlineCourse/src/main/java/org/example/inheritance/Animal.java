package org.example.inheritance;
//Superclass
public abstract class Animal {
    //Somut ve soyutlama yapan yapılardır.
    private int id;
    public abstract void makeSound();

    public void eat(){
        System.out.println("Animal eating");

    }
    public void breathe (){
        System.out.println("Animal breathing");
    }
}
