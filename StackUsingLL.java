package DSA;

public class StackUsingLL {
    private intNode top;
    StackUsingLL(){
        top=null;
    }
    public void push(int d){
        intNode new_node= new intNode(d);
        if(top==null){
            new_node=top;
            return;
        }
        new_node=top.getNext();
        top=new_node;
        return;
    }
    public void display(){
        if(top==null) {
            System.out.println("Empty List");
            return;
        }
        intNode iter= top;
        while(iter !=null){
            System.out.println(iter.getData());
            iter=iter.getNext();
        }
        return;
    }
}
