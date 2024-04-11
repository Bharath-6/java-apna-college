package PracticeLowLevelDesign;

class Calc{
    int a;
    int b;
    public Calc(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void add(){
        int c = a+b;
        System.out.println(c);
    }
    public void sub(){
        int c = a-b;
        System.out.println(c);
    }
    public void multiply(){
        int c = a*b;
        System.out.println(c);
    }
    public void divide(){
        int c = a/b;
        System.out.println(c);
    }
}
public class Calculator {
public static void main(String[] args) {
    Calc c = new Calc(5,5);
    c.add();
    c.sub();
    c.multiply();
    c.divide();
}
}
