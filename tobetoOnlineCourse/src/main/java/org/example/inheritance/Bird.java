package org.example.inheritance;
//subclass
public class Bird extends Animal {
    public void fly(){

    }

    @Override
    public void makeSound() {
        System.out.println("Cik cik");
    }
}
