package DSA;

public class Recursion_4 {
    static int sum_of_digits(int n){
        if(n/10==0)
            return n;
        return n%10+sum_of_digits(n/10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits = "+sum_of_digits(660));
    }
}
