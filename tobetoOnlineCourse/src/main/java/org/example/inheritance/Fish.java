package org.example.inheritance;
//subclass
public class Fish extends Animal{
    public void swim(){

    }

    @Override
    public void makeSound() {
        System.out.println("gluk gluk");
    }

    @Override //ana classdaki bu metodu üzerine yaz
    public void breathe() {
        //this içinde bulunduğu class
        // super => KALITIM ALDIĞI CLASSI İFADE EDER.
        System.out.println("Fish cant breathe");
       //super.breathe();
    }
}
