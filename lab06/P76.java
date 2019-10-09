public class P76{
    public static void main (String[] args){ 
        int n = 5; 
        generateSquare(n); 
    } 

    static void generateSquare(int n){ 
        int[][] magicSquare = new int[n][n]; 
        int i = n/2; 
        int j = n-1; 

        for (int k = 1; k <= n*n;){ 
            if (i == -1 && j == n){ 
                j = n - 2; 
                i = 0; 
            }
            else{ 
                if (j == n) j = 0; 

                if (i < 0) i = n - 1; 
            } 
              

            if (magicSquare[i][j] != 0){ 
                j -= 2; 
                i++; 
                continue; 
            } 
            else magicSquare[i][j] = k++;  
            j++;  i--;  
        } 
    
        System.out.println("The Magic Square for "+n+":"); 
        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
        for(i=0; i<n; i++){ 
            for(j=0; j<n; j++) System.out.print(magicSquare[i][j]+" "); 
            System.out.println(); 
        } 
    } 
}
//dont know why my output is different from the text
//My output:
//9 3 22 16 15
//2 21 20 14 8
//25 19 13 7 1
//18 12 6 5 24
//11 10 4 23 17