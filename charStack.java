package DSA;

public class charStack {
    private char[]arr;
    private int top;
    public charStack(){
        arr= new char[5];
        top=-1;
    }
    charStack(int s){
        arr=new char[s];
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
    public void push(char d){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        else{
            top++;
            arr[top]=d;
        }
    }
    public char pop(){
        char d='*';
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            d=arr[top];
            top=top-1;
        }
        return d;
    }
    public char peek(){
        char d='*';
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            d=arr[top];
        }
        return d;
    }
}
