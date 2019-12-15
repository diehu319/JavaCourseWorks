import java.util.*;
public class P75Array {
    public static int[][] m = new int[4][4]; // 4x4 matrix

    public static void main(String[] args) {
//        int[][] m = {{16,3,2,13}, {5,10,11,8}, {9,6,7,12},{4,15,14,1}}; //a 4x4 magic square

        boolean test1 = P75Array.isMagicSquare();

        System.out.println( "Is your matrix " + P75Array.toString(m) + "a magic square? Answer: " + test1 );
    }

    public static boolean isMagicSquare() {
        int[] list = new int[16]; // 16 inputs
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 16; i++){
            System.out.println("Input an integer from 1 to 16: ");
            int value = in.nextInt();
            int index = value - 1;

            if (!(value <= 0 || value > 16)){ //if input is acceptable
                list[index] = (int) Math.pow(-1, list[index]);
                m[i / 4][i % 4] = value;
            }else{
                System.out.println("Invalid Input.");
                i--;
            }
        }
        in.close();

        //cols and rows
        int sum = 0;
        for (int i = 0; i < m.length; i++){
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < m.length; j++){
                rowSum += m[i][j];
                colSum += m[j][i];
            }
            if (rowSum != colSum) return false;
            if (sum == 0) sum = colSum;
            else {
                if (sum != rowSum) return false;
            }
        }

        //diagonals
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < m.length; i++){
            sum1 += m[i][i];
            sum2 += m[m.length - 1 - i][m.length- 1 - i];
        }
        if (sum1 != sum2) return false;
        else{
            if (sum1 != sum) return false;
        }
        return true;
    }

    public static String toString(int[][] m){
        String result = "\n";
        for (int row = 0; row < m.length; row++){
            for (int col = 0; col < m[row].length; col++){
                result += String.format(" %2d", m[row][col]);
            }
            result = result + "\n";
        }
        return result;
    }
}
