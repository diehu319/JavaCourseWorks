import java.util.stream.*;
import java.util.*;

class P192 {

    public static void palindrome() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many do you want to see: ");
        int n = in.nextInt();

        Stream<Integer> a = Stream.iterate(0, i -> ++i).limit(n);
        a.mapToInt(num -> num * num).forEach(num -> {
            String temp = String.valueOf(num);
            StringBuilder Temp = new StringBuilder(temp);
            if (temp.compareToIgnoreCase(String.valueOf(Temp.reverse())) == 0) System.out.println(temp + "");
        });
    }

    public static void main(String [] args) {
        palindrome();
    }
}