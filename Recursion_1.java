package DSA;

public class Recursion_1 {
    void fun(int n){
        if(n<1)
            return;
        System.out.println(n);
        fun(n-1);
        //System.out.println(n);
        return;

    }

    public static void main(String[] args) {
        Recursion_1 r= new Recursion_1();
        r.fun(5);
    }
}
