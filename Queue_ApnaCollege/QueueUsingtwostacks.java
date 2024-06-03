import java.util.*;
//where push and pop will be 0(n)
//so we will be using only one method which is add
//we will be using two stack
// first push the element into s1
// then for next element take all the elements in the s1 and push them as it is and add new element to s1
// and then again take all elements in the s2 and restore them to s1 how it is their

// while add new element into s1 send all elements in s1 to s2
// new element 3
// s1:
// 1
// 2
// so adding to  s2 will become
// 2
// 1
// and s1 will have 
// 3
// and readd to s1 it will become
// 1
// 2
//3
public class QueueUsingtwostacks {
    static class Twostackusingqueue{
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();

       public static boolean isEmpty(){
        return s1.isEmpty();
       }
       public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
       }
       public static int remove(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return s1.pop();
       }
       public static int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return s1.peek();
       }
    }
    public static void main(String args[]){
        Twostackusingqueue q = new Twostackusingqueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println("Removed: "+q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
