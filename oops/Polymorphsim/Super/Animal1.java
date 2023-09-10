package oops.Polymorphsim.Super;

public class Animal1 {
    String name;

    Animal1(String name){
        this.name=name;
    }
    void makeSound(){
        System.out.println(name+"makes a sound");
    }
}
class Dog extends Animal1{
    String breed;

    Dog(String name, String breed){
        super(name);//calling the superclass constructor to set 'name'
        this.breed=breed;
    }

    @Override
    void makeSound(){
        super.makeSound(); //calling the superclass method
        System.out.println(name+"barks");
    }
}

