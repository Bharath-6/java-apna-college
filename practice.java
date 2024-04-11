class  Vehicle{
    String color;
    public Vehicle(String color){
        this.color = color;
    }
}
class car extends Vehicle{
    String model;
    public car(String color,String model){
        super(color);//calling the constructor of the parent class
        this.model = model;
    }
    public void show1(){
        System.out.println(model+" "+color);
    }
}

public class practice {
    public static void main(String args[]){
        car mycar = new car("Red","Bmw");
        mycar.show1();


    }
}
