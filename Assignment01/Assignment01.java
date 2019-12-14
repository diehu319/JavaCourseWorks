import java.math.BigInteger;

public class Assignment01 {

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    BigInteger n = new BigInteger(args[0]);
    long endTime = System.nanoTime();
    System.out.println("It took " + (endTime - startTime) + "nano seconds to calculate fib( " + n + " ) = " + fun(n));
  }

  public static BigInteger fun(BigInteger n){
    if (n.equals(new BigInteger("0"))) return new BigInteger("1");
    else if (n.equals(new BigInteger("1"))) return new BigInteger("1");
    else return funHelper(new BigInteger("1"), n, new BigInteger("1"), new BigInteger("1"));
  }

  public static BigInteger funHelper(BigInteger location, BigInteger target, BigInteger a, BigInteger b){
    if (location.compareTo(target) == 0) return b;
    else return funHelper(location.add(new BigInteger("1")), target, b, b.add(a));
  }
}

//Interactions:
//> run Assignment01 10
//It took 26900nano seconds to calculate fib( 10 ) = 89
