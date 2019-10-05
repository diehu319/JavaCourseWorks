//R6.32
import java.util.*;

public class Travel{
    public static void main(String[] args){
        Random n = new Random(); //from java.util.*
        //Integer number;
        int number;
        int n_int1 = n.nextInt(15);//Harry has 15 friends
        if (n_int1 >= 0 && n_int1 <= 9) number = 1;// California
        else if (n_int1 >= 9 && n_int1 <= 12) number = 2;// Nevada
        else number = 3;// Utah
        System.out.println(number);
    }
}



//Xiaohan Zhang helped me to understand the Random instance and the nextInt method.