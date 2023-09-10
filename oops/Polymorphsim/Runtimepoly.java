package oops.Polymorphsim;


public class Runtimepoly {
    
}
//this is a example code not running code
class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSOund(){
        System.out.println("Dog barks");
    }
}