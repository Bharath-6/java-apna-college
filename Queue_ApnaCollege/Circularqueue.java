//where in this circular queue where front will be at 0 if delete that element.Then front  move to front=(front+1)%size; and rear will rear=(rear+1)%size if rear ends it will go to zero
//to check full or not (Rear+1)%size== front
//intially rear=-1 and front=-1
public class Circularqueue {
    static class Cirqueue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Cirqueue(int n){
            arr=new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //check full or not
        public static boolean isFull(){
            return (rear+1%size==front);
        }
        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("The queue is full");
            }
            //1st element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove 0(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
            return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear = front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Cirqueue q = new Cirqueue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Removed: "+q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    


}
