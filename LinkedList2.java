package DSA;

public class LinkedList2 {
    private intNode head;
    public LinkedList2(){
        head=null;
    }
    public void insert_first(int d){
        intNode new_node=new intNode(d);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.setNext(head);
        head=new_node;
        return;
    }
    public void insert_last(int d){
        intNode new_node= new intNode(d);
        if(head==null){
            head=new_node;

        }
        intNode iter=head;
        while(iter.getNext()!=null){
            iter=iter.getNext();
        }
        iter.setNext(new_node);

    }
    public void display(){
        if(head==null) {
            System.out.println("Empty List");
            return;
        }
        intNode iter= head;
        while(iter !=null){
            System.out.println(iter.getData());
            iter=iter.getNext();
        }
        return;
    }
}
