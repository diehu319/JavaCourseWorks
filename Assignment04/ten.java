//R7.8
import java.util.*;

public class ten{
    public static void main(String[] args){
        int[] a = new int[10];
        Random generator = new Random();
        for(int i = 0 ; i < a.length; i++){
            int number = 1 + generator.nextInt(100);
            a[i] = number;
        }
        for(int j = 0; j < a.length; j++) {
            int temp1 = a[j];
            for(int pos = 0; pos < a.length; pos++) {
                int temp2 = a[pos];
                if( temp1 == temp2 && j != pos)
                    a[j] = 1 + generator.nextInt(100);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}