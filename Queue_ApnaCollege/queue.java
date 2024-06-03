//Queue:FIFO- first in first out
//Enque - Add
//Dequeue - Remove
//Front-Peek
//Implementing using array
//Front - 0
//Rear(back) - n-1
// Mostly array wont be used as queue because it is having fixed size
//intially the R=-1 and F=-1
//After inserting first i will stay at index 0 and rear will move to 1 and next 2 and next 3 upto n
//if front element is deleted the rear will be back if it is at 3 means if front element is delete then it will come 2
//generally the time complexity for adding and deleting in stack 0(1) but in queue using array for add it is 0(1) for removing 0(n) and peek is 0(n)
public class queue {
    static class QueueArray{
        int arr[];
        int n;
        int rear=-1;
        QueueArray(int n){
            this.n = n;
            arr= new int[n];
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        //add
        public void add(int data){
            if(rear==n-1){
                System.out.println("Full queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeu
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    
    }
    public static void main(String args[]){
        QueueArray q = new QueueArray(7);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
                q.remove();
        }
    }

}

