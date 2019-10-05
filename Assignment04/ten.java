//R7.8
import java.util.*;

public class ten{
    public static void main(String[] args){
        Random n = new Random();
        int[] array = new int[10]; //created an array of 10 index
        int[] newArray = new int[10];
        int index = 0;//set index = 0 for the while loop
    
        while (index < array.length){
            int number = 1 + n.nextInt(100);//+1 because nextInt includes 0 and excludes 100
            for (int i = 0; i < index; i++){
                int item = array[i];
                System.out.println(Arrays.toString(array));
            }
        }
    }
}