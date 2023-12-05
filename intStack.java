package DSA;

public class intStack {
    private int arr[];
    private int top;

    public intStack(){
        arr= new int[5];
        top=-1;
    }
    public intStack(int s){
        arr=new int[s];
        top=-1;
    }
    public boolean isFull(){
        if(top== arr.length-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public void push(int d){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        else{
            top++;
            arr[top]=d;
            return;
        }
    }
    public int pop(){
        int d=-999;
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            d=arr[top];
            top--;
        }
        return d;
    }
    public int peek(){
        int d=-999;
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            d=arr[top];
        }
        return d;
    }
//    void display(){
//        System.out.print("Array = ");
//        for(int i=0; i<arr.length; i++)
//            System.out.print(" "+arr[i]);
//    }
}
