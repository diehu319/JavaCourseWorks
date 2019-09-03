//Lab 1 Program for big decimals
import java.math.BigDecimal;

public class Lab1{
  public static void main(String[] args){
    BigDecimal a,b,c,d,e;
    a = new BigDecimal("1");
    b = new BigDecimal("2");
    c = new BigDecimal("3");
    d = new BigDecimal("4");
    e = new BigDecimal("5");
    System.out.println("1 + 2 = " + a.add(b));
    System.out.println("2 * 3 = " + b.multiply(c));
    System.out.println("(1 - (2 - (3 - 4))) = " + a.subtract(b.subtract(c.subtract(d))));
    System.out.println("1 - 2 - 3 - 4 = " + a.subtract(b).subtract(c).subtract(d));
    System.out.println("2 * 3 - 4 * 5 = " + b.multiply(c).subtract(d.multiply(e)));
  }
}
//This program prints  out:
//1 + 2 = 3 
//2 * 3 = 6 
//(1 - (2 - (3 - 4))) = -2 
//1 - 2 - 3 - 4 = -8 
//2 * 3 - 4 * 5 = -14 