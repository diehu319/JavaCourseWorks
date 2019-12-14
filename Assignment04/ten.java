//R7.8
import java.time.ZonedDateTime;
import java.util.*;

public class ten{
    public static final Random r = new Random();

    public static void main(String[] args){
        randomNumber();
        randomDifferentNumber();
    }

    public static void randomNumber(){ //Random 10 numbers
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++){
            a[i] = r.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void randomDifferentNumber(){ //10 Different random numbers
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++){
            b[i] = r.nextInt(100) + 1;
            for (int j = 0; j < i; j++){
                if (b[j] == b[i]){
                    i--; //if number duplicates, go back to generate another number
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}