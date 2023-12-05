package DSA;

public class intNode {
    private int data;
    private intNode next;
    public intNode(){
        data=0;
        next=null;
    }
    public intNode(int d){
        data=d;
        next=null;
    }
    public void setData(int d){
        data=d;
    }

    public int getData() {
        return data;
    }
    public void setNext(intNode n){
        next=n;
    }
    public intNode getNext(){
        return next;
    }
}
