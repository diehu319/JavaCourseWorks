import java.util.*;

public class P76ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an odd number for your magic square's row or column: ");
        int n = in.nextInt();
        if(n % 2 != 1) System.out.println("Invalid Input, enter again: ");
        n = in.nextInt();
        in.close();
        ArrayList<Integer> m = new ArrayList<Integer>();
        for (int i = 0;i < n*n; i++) {
            m.add(0);
        }

        int row = n-1, col = n/2; //set row = n-1, column = n/2
        for (int k = 1; k <= n*n; k++){ //for k = 1...n*n
            m.set((row) * n + col, k); //place k at [row][column]

            row++;//increment row and col
            col++;

            if (row == n) row = 0; // if the row or column is n, replace it with 0
            if (col == n) col = 0;

            if (m.get(row*n+col) != 0){ // if element at [row][column] has already filled

                if(row == 0) row = n-1;//set row and column to previous values
                else row--;
                if(col == 0) col = n-1;
                else col--;

                row--; //decrement row
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%2d ", m.get(i * n + j));
            }
            System.out.println();
        }
    }
}
