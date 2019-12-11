import java.math.BigInteger;
import java.util.stream.*;
import java.util.*;

public class P192 {

    public static void main(String[] args){
        BigInteger b = new BigInteger("12321");
        System.out.println(isPalindrome(b));

        BigInteger two = new BigInteger("2");
        Stream<BigInteger> stream = Stream.iterate(BigInteger.ONE, bi -> bi.add(BigInteger.ONE));
        Stream<BigInteger> interm = stream.filter(n -> n.compareTo(BigInteger.ONE) > 0).limit(5);
        List<BigInteger> ls = interm.collect(Collectors.toList());
        System.out.println(ls);
    }

    public static boolean isPalindrome(BigInteger n){
        String rev = (new StringBuilder(n.toString())).reverse().toString();
        return n.toString().equals(rev);
    }
}
