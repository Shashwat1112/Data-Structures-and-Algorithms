package DSA;

public class CircularLinkedList {
    intNode last;
    public CircularLinkedList(){
        last=null;
    }
    public void insertFirst(int d){
        intNode new_node= new intNode(d);
        if(last==null){
            last=new_node;
            last.setNext(last);
            return;
        }
        new_node.setNext(last.getNext());
        last.setNext(new_node);
        //last=new_node;
        return;
    }
    public void display(){
        intNode iter=last;
        //while(iter)
    }
}
