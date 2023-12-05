package DSA;

public class LinkedList {
    private intNode head;
    public LinkedList(){
        head=null;
    }
    public void insertFirst(int d){
        intNode new_node= new intNode(d);

        if(head==null){
            head=new_node;
            return;
        }
        else{
            new_node.setNext(head);
            head=new_node;
            return;
        }
    }
    public void insertLast(int d){
            intNode new_node= new intNode(d);
            if (head == null) {
                head=new_node;
                return;
            }
            intNode iter= head;
            while(iter.getNext()!=null){
                iter=iter.getNext();
            }
            iter.setNext(new_node);
            return;

    }
    public void display(){
        if(head==null)
            System.out.println("Empty list");
        intNode iter= head;
        while(iter!=null){
            System.out.println(iter.getData());
            iter=iter.getNext();
        }
        return;
    }

    public void insert_by_pos(int d, int pos){
        intNode new_node= new intNode(d);
        int i;
        if(head==null){
            head=new_node;
            return;
        }
        if(pos==1){
            new_node.setNext(head);
            return;
        }
        intNode iter= head;
        for(i=1; i<pos-1 && iter.getNext()!=null; i++){
            iter=iter.getNext();
        }
        new_node.setNext(iter.getNext());
        iter.setNext(new_node);
        return;
    }
    public int delete_first(){
        intNode deletable;
        int d;
        if(head==null){
            System.out.println("Empty List");
            return -999;
        }
        deletable=head;
        head=head.getNext();
        d=deletable.getData();
        deletable=null;
        return d;
    }

    public int delete_last(){
        intNode deletable;
        int d;
        if(head==null){
            System.out.println("Empty List");
            return -999;
        }
        if(head.getNext()==null){
            d=head.getData();
            deletable=head;
            head=null;
            deletable=null;
            return d;
        }
        intNode iter= head;
        while(iter.getNext().getNext()!=null){
            iter=iter.getNext();
        }
        deletable=iter.getNext();
        d=deletable.getData();
        iter.setNext(null);
        deletable=null;
        return d;
    }

    public int delete_by_pos(int pos){
        intNode deletable;
        int d;
        if(head==null){
            System.out.println("List is empty");
            return -999;
        }
        deletable=head;
        head=head.getNext();
        d=deletable.getData();
        deletable=null;
        //return d;

        if(head.getNext()==null){
            System.out.println("Invalid position");
            return -999;
        }
        int i;
        intNode iter;
        for(i=1, iter=head; i<pos-1 && iter.getNext()!=null; i++, iter=iter.getNext());
        if(iter.getNext()==null){
            System.out.println("Invalid position");
            return -999;
        }
        deletable=iter.getNext();
        d=deletable.getData();
        iter.setNext(deletable.getNext());
        return d;
    }
    public String to_String(){
        String str= new String();
        if(head==null)
        {
            System.out.println("Empty List");
            return str;
        }
        intNode iter=head;
        str=str+"List ";
        while(iter!=null){
            str=str+iter.getData()+"->";
            iter=iter.getNext();
        }
        str=str+"\n";
        return str;
    }
    public void insert_sorted(int d){
        intNode new_node= new intNode();
        if((head==null)||(d<head.getData())){
            new_node.setNext(head);
            head=new_node;
            return;
        }
        intNode iter=head;
        while((iter.getNext()!=null) && (d>iter.getNext().getData())){
            iter=iter.getNext();
            new_node.setNext(iter.getNext());
            iter.setNext(new_node);
            return;
        }
    }
}
