package DSA;

import java.util.Scanner;

class Childern{
    private  int number;
    private String name;

    public Childern(int number,String name) {
        this.number = number;
        this.name=name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Node{
    private Childern data;
    private Node next;

    public Node(Childern data) {
        this.data = data;
        this.next = null;
    }

    public Childern getData() {
        return data;
    }

    public void setData(Childern data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
class StackLinked{
    Node head;

    public StackLinked() {
        this.head = null;
    }

    public void createNode(Childern obj){
        Node n=new Node(obj);
        if(head==null){
            head=n;
            return;
        }
        n.setNext(head);
        head=n;
    }
    public void display(){
        Node itr=head;
        while(itr!=null){
            System.out.println("Number: "+itr.getData().getNumber()+" Name "+itr.getData().getName());
            itr=itr.getNext();
        }
    }
}
public class StackObjects {
    public static void main(String[] args) {
        StackLinked sl=new StackLinked();
        Scanner sc=new Scanner(System.in);
        while(true){
            Childern c1=new Childern(10,"verma");
        }
    }
}
