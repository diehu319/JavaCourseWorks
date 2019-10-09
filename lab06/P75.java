//P7.5
public class P75{ 
    public static void main(String[] args) { 
        int [][] m = { {16, 3, 2, 13}, { 5, 10, 11, 8}, {9, 6, 7, 12}, { 4, 15, 14, 1} };
        boolean test = P75.isMagicSquare(m);
        System.out.println( "Is your matrix " + P75.toString(m) + "a magic square? Answer: " + test ); 
    }
    
    static boolean isMagicSquare(int [][] m) { 
        int sum = 0,sum2=0;  

        for (int i = 0; i < m.length; i++) sum = sum + m[i][i];  // set the first sum to be a value

        for (int i = 0; i < m.length; i++) sum2 = sum2 + m[i][m.length-1-i]; // set the second sum  

        // if first sum != second sum then false in any way
        if(sum!=sum2) return false; 
  
        // For sums of Rows, if sum of rows != the first sum, then false anyway
        for (int i = 0; i < m.length; i++) { 
            int SumRow = 0; 

            for (int j = 0; j < m.length; j++) SumRow += m[i][j]; 

            if (SumRow != sum) return false; 
        } 
  
        // For sums of Columns, if sum of rows != the first sum, then false anyway
        for (int i = 0; i < m.length; i++) { 
            int SumCol = 0; 

            for (int j = 0; j < m.length; j++) SumCol += m[j][i]; 

            if (sum != SumCol) return false; 
        } 
        //else return true
        return true; 
    }
    public static String toString(int[][] m) {
        String result = "\n";
        for (int row = 0; row < m.length; row++) {
          for (int col = 0; col < m[row].length; col++) {
             result = result + String.format( " %2d", m[row][col] );
             // also: https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/backmatter.jpg
          }
          result = result + "\n"; 
        }
        return result; // + "\n";
      }     
} 

