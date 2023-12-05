package DSA;

public class doubleEndedStack {
    private int[]arr;
    private int topA, topB;
    public doubleEndedStack(){
        arr=new int[5];
        topA=-1;
        topB=arr.length;
    }
    public doubleEndedStack(int s){
        arr=new int[s];
        topA=-1;
        topB=arr.length;
    }
    public boolean isFull(){
        if(topB-topA==1)
            return true;
        else
            return false;
    }
    public boolean isEmptyA(){
        if(topA==-1)
            return true;
        else
            return false;
    }
    public boolean isEmptyB(){
        if(topB==arr.length)
            return true;
        else
            return false;
    }
    public void pushA(int d){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        else{
            topA++;
            arr[topA]=d;
        }
    }
//    public void pushB(int d){
//        if(isFull()){
//            System.out.println("Overflow");
//            return;
//        }
//        else{
//            topB--;
//            arr[topB]=d;
//        }
//    }
    public int popA(){
        int d=-999;
        if(isEmptyA())
            System.out.println("Underflow");
        else{
            d=arr[topA];
            topA--;
        }
        return d;
    }
    public int peekA(){
        int d=-999;
        if(isEmptyA()){
            System.out.println("Underflow");
        }
        else{
            d=arr[topA];
        }
        return d;
    }
    public void pushB(int b){
        if(isFull()){
            System.out.println("Overflow");
        }
        else{
            topB--;
            arr[topB]=b;
        }
    }
    public int popB(){
        int temp=-999;
        if(isEmptyB()){
            System.out.println("Underflow B");
        }
        else{
            temp=arr[topB];
            topB++;
        }
        return temp;
    }
    public int peekB(){
        int temp=-999;
        if(isEmptyB())
            System.out.println("Underflow B");
        else
        {
            temp=arr[topB];
        }
        return temp;
    }
}
