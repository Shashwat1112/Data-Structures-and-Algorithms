package DSA;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertLast(50);
        l.insert_by_pos(40,5);
        l.display();
//        System.out.println();
//        //l.delete_first();
//        //System.out.println("Value deleted = "+l.delete_last());
//        //l.delete_by_pos(3);
//        System.out.println(l.to_String());
//        l.display();
//        System.out.println();
//        l.insert_sorted(77);
//        l.display();
    }
}
