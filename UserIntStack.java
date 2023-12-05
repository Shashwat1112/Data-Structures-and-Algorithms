package DSA;

public class UserIntStack {
    public static void main(String[] args) {
        intStack i=new intStack();
        i.push(5);
        i.push(6);
        i.push(7);
        System.out.println(i.pop()+" ");
        System.out.println(i.peek());
        System.out.println(i.pop()+" ");
        //i.display();

    }
}
