package Collections.List;
import java.util.*;

public class ArrayListExample {
    public void arrayListExample(){
        //Array list is growable
        //duplicates allowed
        //insertion order is also preserved
        //ArrayList al = new ArrayList()  // for storing different datatypes
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);//adding element at the end of arraylist
        l.add(0,2);//at particular index
        l.size();//length of array list
        l.remove(1); //removing element in a particular index
        l.set(1,1); //adding element at a particular index
        //System.out.println(contains(2)); -true or false return element is their or not
        //isEmpty()- check is empty true or else false
        //addAll()-adding group of element
        //RemoveAll()-for remvoing all elements
        //Collections.sort(l)-sorting all elements in arraylist
        //collections.shuffle(l)-shuffling the elements
        System.out.println(l);//1,2,3
        System.out.println(l.get(1));
        l.set(1,10); 
        System.out.println(l);
        //Types of loop
        // 1)for(int i=0;i<al.size()-1;i++){
        //     System.out.println(al.get(i));
        // }
        // 2) for each loop
        // reading elements in the arraylist
        // for(int num : l){
        //     System.out.println(e);
        // }
        // 3)iterator reading element if it is their return true and we need to get the element it will be move automatically 
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }


        // for adding all elements previously stored in arraylist to new arryaylist
        // ArrayList al_dup=new ArrayList();
        // al_dup.addAll(al);
        // System.out.println(al_dup);
        

        // al_dup.removeAll(al);
        // System.out.println(al_dup);

        //sorting
        Collections.sort(l);
        System.out.println(l);

        //sorting in reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);

        //shufflying the elements in arraylist
        Collections.shuffle(l);
        System.out.println(l);
        //for converting array to arraylist
        //ArrayList al = new ArrayList(Arrays.asList(arr));
    }
    public static void main(String args[]){
        ArrayListExample example = new ArrayListExample();
        example.arrayListExample();
   }
    
    
}
