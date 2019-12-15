import java.util.*;
public class P75ArrayList {
    public static ArrayList<ArrayList<Integer>> mm = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
//        int[][] m = {{16,3,2,13}, {5,10,11,8}, {9,6,7,12},{4,15,14,1}}; //a 4x4 magic square

        boolean test2 = P75ArrayList.isMagicSquare();

        System.out.println( "Is your matrix " + P75ArrayList.toString(mm) + "a magic square? Answer: " + test2 );
    }

    public static boolean isMagicSquare(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 16; i++){ //16 inputs
            list.add(0);
        }

        ArrayList<Integer> one = new ArrayList<Integer>();
        mm.add(one);
        ArrayList<Integer> two = new ArrayList<Integer>();
        mm.add(two);
        ArrayList<Integer> three = new ArrayList<Integer>();
        mm.add(three);
        ArrayList<Integer> four = new ArrayList<Integer>();
        mm.add(four);

        for(int i = 0; i < 16; i++){
            System.out.println("Input an integer from 1 to 16: ");
            int value = in.nextInt();
            int index = value - 1;

            if (!(value <= 0 || value > 16)){
                list.set(index, (int) Math.pow(-1, list.get(index)));
                mm.get(i/4).add(value);}else{
                System.out.println("Invalid Input.");
                i--;
            }
        }
        in.close();

        //check sum of rows & cols
        int sum = 0;
        for (int i = 0; i < mm.size(); i++){
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < mm.size(); j++){
                rowSum += mm.get(i).get(j);
                colSum += mm.get(j).get(i);
            }
            if (rowSum != colSum) return false;
            if (sum == 0) sum = colSum;
            else{
                if (sum != rowSum) return false;
            }
        }

        //diagonals
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mm.size(); i++){
            sum1 += mm.get(i).get(i);
            sum2 += mm.get(mm.size() - 1 - i).get(mm.size() - 1 - i);
        }
        if (sum1 != sum2) return false;
        else{
            if (sum1 != sum) return false;
        }
        return true;
    }

    public static String toString(ArrayList<ArrayList<Integer>> mm) {
        String result = "\n";
        for (int row = 0; row < mm.size(); row++) {
            for (int col = 0; col < mm.get(row).size(); col++) {
                result = result + String.format( " %2d", mm.get(row).get(col) );
            }
            result = result + "\n";
        }
        return result; // + "\n";
    }
}
