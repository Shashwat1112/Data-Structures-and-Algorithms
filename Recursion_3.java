package DSA;

public class Recursion_3 {
    static int count(int n){
        if(n/10==0)
            return 1;
        System.out.println(n);
        return (1+count(n/10));
    }

    public static void main(String[] args) {
        System.out.println("Count of digits = "+count(140));
    }
}
