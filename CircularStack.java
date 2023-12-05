package DSA;

public class CircularStack {
    private int arr[];
    private int front, rear;
    CircularStack(){
        arr= new int[6];
        front=-1;
        rear=-1;
    }
    CircularStack(int size){
        arr= new int[size];
        front=-1;
        rear=-1;
    }
    public boolean isFull(){
        if(((front==0) && (rear== arr.length-1)) || (front-rear==1)) {
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty(){
        if(front==-1)
            return true;
        else
            return false;
    }
    public void enQueue(int d){
        if(isFull())
            System.out.println("Overflow");
        else{
            if(front==-1)
                front=0;
            else
                rear++;
        }
        arr[rear]=d;
    }
}
