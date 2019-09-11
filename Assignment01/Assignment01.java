import java.math.BigInteger;

public class Assignment01 {
  public static void main(String[] args) {
    System.out.println(fun(10));
    String number = args[0];
    BigInteger n = new BigInteger(number);
    System.out.println(n.add(new BigInteger("1")));
  }

  public static BigInteger fun(int index) {
    if (index == 0)
      return new BigInteger("1");
    else if (index == 1)
      return new BigInteger("1");
    else {
      return funHelper(1, index, new BigInteger("1"), new BigInteger("1"));
    }
  }

  public static BigInteger funHelper(int location, int target, BigInteger a, BigInteger b) {
    if (location == target)
      return b;
    else {
      return funHelper(location + 1, target, b, a.add(b));
    }
  }
}