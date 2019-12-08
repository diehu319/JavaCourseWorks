//E13.15
import java.util.*;
public class SubstringGenerator {
    String word;

    public SubstringGenerator(String x) { word = x;}

    public static void main(String[] args){
        SubstringGenerator a = new SubstringGenerator("rum");
        List b = a.subsets();
        Collections.sort(b, Collections.reverseOrder(Comparator.comparing(String::length)));
        System.out.println(b);
    }

    public List subsets(){
        ArrayList<String> subsets = new ArrayList<String>();
        int len = word.length();
        for (int i = 0; i < Math.pow(2,len); i++){
            String a = "";
            for (int j = 0; j < len; j++){
                if ((i & (int) (Math.pow(2,j))) > 0) a += word.charAt(j) + "";
            }
            subsets.add(a);
        }
        return subsets;
    }
}
