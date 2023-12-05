package DSA;

public class LinearStack {
    private int[]arr;
    private int rear, front;
    public LinearStack(){
        arr= new int[6];
        front=-1;
        rear=-1;
    }
    public LinearStack(int size){
        arr= new int[size];
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        if((front==-1) || (front-rear==1)){
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if(front==0 && rear== arr.length-1){
            return true;
        }
        else
            return false;
    }
    public void enQueue(int d){
        if(isFull()){
            System.out.println("Overflow");
        }
        else{
            if(front==-1)
                front=0;

            rear++;
            arr[rear]=d;
        }
    }
    public int deQueue(){
        int temp=-999;
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            temp=arr[front];
            front++;
//                return temp;
        }
        return temp;
    }
    public int peek(){
        if(isEmpty())
            return -999;
        else
            return arr[front];
    }
}
