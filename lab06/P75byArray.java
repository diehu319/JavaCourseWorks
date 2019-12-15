import java.util.*;
public class P75byArray {
    public static int[][] m = new int[4][4]; // 4x4 matrix

    public static void main(String[] args) {
//        int[][] m = {{16,3,2,13}, {5,10,11,8}, {9,6,7,12},{4,15,14,1}};

        boolean test1 = P75byArray.isMagicSquare();

        System.out.println( "Is your matrix " + P75byArray.toString(m) + "a magic square? Answer: " + test1 );
    }

    public static boolean isMagicSquare() {
        int[] num = new int[16]; // 16 inputs
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 16; i++){
            System.out.println("Input an integer from 1 to 16: ");
            int value = in.nextInt();
            int index = value - 1;

            if (!(value <= 0 || value > 16)){ //if input is acceptable
                num[index] = (int) Math.pow(-1, num[index]);
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
            int tempSumOfRow = 0;
            int tempSumOfCol = 0;
            for (int j = 0; j < m.length; j++){
                tempSumOfRow += m[i][j];
                tempSumOfCol += m[j][i];
            }
            if (tempSumOfCol != tempSumOfRow) return false;
            if (sum == 0) sum = tempSumOfCol;
            else {
                if (sum != tempSumOfRow) return false;
            }
        }

        //diagonals
        int sumOfDiagOne = 0;
        int sumOfDiagTwo = 0;
        for (int i = 0; i < m.length; i++){
            sumOfDiagOne += m[i][i];
            sumOfDiagTwo += m[m.length-1 - i][m.length-1 - i];
        }
        if (sumOfDiagOne != sumOfDiagTwo) return false;
        else{
            if (sumOfDiagOne != sum) return false;
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
