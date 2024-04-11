package PracticeLowLevelDesign;

class Rect{
    int length;
    int width;
    public void area(){
        int area = length*width;
        System.out.println(area);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.length = 5;
        r.width = 10;
        r.area();

    }
}
