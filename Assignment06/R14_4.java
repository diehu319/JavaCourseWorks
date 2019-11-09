import java.lang.Math;

public class R14_4{
    public static void main(String[] args){
        //T(n) = (1/2)n^2 + (5/2)n - 3

        //T(2000) / T(1000)
        System.out.println((1/2*Math.pow(2000,2) + 5/2 * 2000 -3) / (1/2*Math.pow(1000,2) + 5/2 * 1000 -3));

        //T(4000)/T(1000)
        System.out.println((1/2*Math.pow(4000,2) + 5/2 * 4000 -3) / (1/2*Math.pow(1000,2) + 5/2 * 1000 -3));

        //T(10000)/T(1000)
        System.out.println((1/2*Math.pow(10000,2) + 5/2 * 10000 -3) / (1/2*Math.pow(1000,2) + 5/2 * 1000 -3));

        //f(n) = n^2

        //f(2000)/f(1000)
        System.out.println(Math.pow(2000,2) / Math.pow(1000,2));

        //f(4000)/f(1000)
        System.out.println(Math.pow(4000,2) / Math.pow(1000,2));

        //f(10000)/f(1000)
        System.out.println(Math.pow(10000,2) / Math.pow(1000,2));
    }
}