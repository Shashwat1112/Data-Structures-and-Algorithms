package DSA;
public class UserCharStack {
    public static void main(String[] args) {
        charStack c= new charStack(4);
        c.push('A');
        c.push('B');
        c.push('C');
        c.push('D');

        //System.out.println("Pop: "+c.pop());
        System.out.println("Peek: "+c.peek());
    }
}
