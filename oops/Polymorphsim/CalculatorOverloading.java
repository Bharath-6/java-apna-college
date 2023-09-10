package oops.Polymorphsim;

public class CalculatorOverloading {
    //Method for integer addition
    public int add(int a, int b){
        return a+b;
    }

    //Method for double addition (overloaded)
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String args[]){
        CalculatorOverloading calculator = new CalculatorOverloading();

        //calling the integer addition method
        int result1= calculator.add(5,10);
        System.out.println("Integer Addition Result:"+result1);

        //calling the double addition method
        double result2 = calculator.add(3.5,2.7);
        System.out.println("Double Addition Result:"+result2);
    }
}
