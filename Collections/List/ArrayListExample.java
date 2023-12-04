package Collections.List;
import java.util.*;

public class ArrayListExample {
    public void arrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);//1,2,3
        System.out.println(l.get(1));
        l.set(1,10); 
        System.out.println(l);


    }
    public static void main(String args[]){
        ArrayListExample example = new ArrayListExample();
        example.arrayListExample();
   }
    
    
}
