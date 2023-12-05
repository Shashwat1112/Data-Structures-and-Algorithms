package DSA;

public class Rec_fact {
    static int factorial(int n){
        if(n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial = "+factorial(5));
    }
}
