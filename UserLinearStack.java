package DSA;

public class UserLinearStack {
    public static void main(String[] args) {
        LinearStack l= new LinearStack();
        l.enQueue(5);
        l.enQueue(6);
        l.enQueue(7);
        l.enQueue(8);
        l.enQueue(9);
        l.enQueue(10);
        System.out.println("Peek B: "+l.peek());
    }
}
