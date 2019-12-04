//E5.22
import java.util.*;
import java.math.*;

public class floating{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two floating-point numbers: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        x = Math.round(x * 100);   //two decimal places
        y = Math.round(y * 100);
        if (x == y) System.out.println("They are the same up to two decimal places.");
        else System.out.println("They are different.");
    }
}
//
//Enter two floating-point numbers:
//2.0 1.99998
//They are the same up to two decimal places.

//
//Enter two floating-point numbers:
//2.0 1.98999
//They are different.