//E13.15
import java.util.*;
public class SubstringGenerator {
    String word;

    public SubstringGenerator(String x) { word = x;}

    public static void main(String[] args){
        SubstringGenerator a = new SubstringGenerator("rum");
        List b = a.subsets();
        System.out.println(b);
        System.out.println("Expected: [rum, ru, rm, r, um, u, m]");
    }

    public List subsets(){
        ArrayList<String> subsets = new ArrayList<String>();
        int len = word.length();
        for (int i = (int) (Math.pow(2, len) - 1.0); i > 0; i--){
            String a = "";
            String b = Integer.toBinaryString(i);
            while (b.length() != word.length()) b = "0" + b;
            for (int j = 0; j < len; j++) {
                if (b.charAt(j) == '1') {
                    a += word.substring(j, j + 1);
                }
            }
            subsets.add(a);
        }
        return subsets;
    }
}
