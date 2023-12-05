package DSA;

public class UserDoubleEndedStack {
    public static void main(String[] args) {
        doubleEndedStack s=new doubleEndedStack(6);
        s.pushA(5);
        s.pushA(6);
        s.pushA(7);
        s.pushA(8);
        System.out.println("Pop A: "+s.popA());
        System.out.println("Peek A: "+s.peekA());
        s.pushB(8);
        s.pushB(9);
        s.pushB(10);
//        s.pushB(10);
//        s.pushB(10);
//        s.pushB(10);
//        s.pushB(10);
        System.out.println();
        System.out.println("Pop B: "+s.popB());
        System.out.println("Peek B: "+s.peekB());
    }
}
