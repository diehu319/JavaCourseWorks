import java.math.*;
public class E1313 {
    public static void main(String[] args){
        System.out.println(squareRoot(141));
        System.out.println(squareRoot(16));
    }

    //Helper
    public static double squareRootGuess(double x, double g){
        if (g < 0 || x <= 0) return 0; //Negative numbers don't have real square roots since a square is either positive or 0.
        else if (Math.abs(Math.sqrt(x) - g) <= 0.001) { //if g^2 is approximately equal to x and x > 0 -> absolute value
            return g;
        }else{
            double guess = (g + x/g) / 2; //better guess
            return squareRootGuess(x,guess); //recursive
        }
    }

    public static double squareRoot(double x){
        return squareRootGuess(x, x-1);
    }
}
