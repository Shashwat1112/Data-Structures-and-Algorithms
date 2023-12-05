package DSA;

public class BTnode {
    private int data;
    public BTnode left, right;
    public BTnode() {data=0; left=null; right=null;}
    public BTnode(int d) {data=d; right=null; left=null;}
    public void setData(int d) {data=d;}
    public int getData() {return data;}
    public void setLeft(BTnode l) {left=l;}
    public BTnode getLeft() {return left;}
    public void setRight(BTnode r) {right=r;}
    public BTnode getRight() {return right;}
}
