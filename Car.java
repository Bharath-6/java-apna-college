public class car {
    //Attributes
    private String make;
    private String model;
    private int year;
    private int speed;


    //Default constructors
    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
        speed = 0;
    }
     // Parameterized constructor
    public Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
        speed=0;
    }
    //Method to brake
    public void brake(int decrement){
        if(speed>=decrement){
            speed-=decrement;
            System.out.println("Braking. Current speed:"+speed+"mph");
        }else{
            System.out.println("Cannot brake furtherSpeed is already 0mph");
        }
        }
    }
    //method to display car information
    public void displayInfo(){
        System.out.println("car make"+make);
        System.out.println("car make"+model);
        System.out.println("car make"+year);
        System.out.println("car make"+speed);
        
        
    }
    public static void main(String[] args){
        // create car objects using constuctors
        Car car1=new Car("Toyota", "Camry", 2020);
        Car car2=new Car();

        //Display car information
         System.out.println("Car 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();

        // Accelerate and brake car 1
        car1.accelerate(40);
        car1.brake(10);

        // Accelerate and brake car 2
        car2.accelerate(30);
        car2.brake(20);
    }
    

