import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(0);
        list.add(2);
        System.out.println(list);

        //get elements
        int element=list.get(0);//finding with index
        System.out.println(element);

        //add el in between
        list.add(1,1);
        System.out.println(list);

        //set element means replace
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //finding the size of array list
        int size=list.size();
        System.out.println(size);
        //the size will be displayed after all operations done in that array so we expected 1 but it is 2

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //sorting

        Collections.sort(list);
        System.out.println(list);

    }
}
