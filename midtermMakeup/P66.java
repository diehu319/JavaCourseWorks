//P6.6
//The game of Nim

import java.util.Random;
import java.util.Scanner;

public class P66{
  public static void main(String[] args){
    System.out.println("");
    for (int i = 0; i < 10; i++){
      nim();
    }
  }
  
  
  public static void nim() {
    Random r = new Random();
    // Range of [10, 101) = 10 + [0, 91)
    int n = r.nextInt(91) + 10;
    System.out.println("There are " + n + " marbles to begin with.");
    int turn = r.nextInt(2); // 0 for human player and 1 for computer
    int smart = r.nextInt(2);// 1 is smart and 0 is stupid
    System.out.println("The computer is " + (smart == 1 ? "smart" : "stupid"));
    // if the computer is in stupid mode, it will draw between [1, n/2] = 1 + [0, n/2 - 1]
    int compTurn = 0; // Marbles the computer will take
        
    Scanner in = new Scanner(System.in);
    int myTurn = 0;
    
    while (n > 0) { // While there are still marbles to take
      if (turn == 0) { // If it's the human's turn 
        System.out.println("Enter the number of marbles to take: "); 
        myTurn = in.nextInt();
        if ((myTurn <= n / 2 && myTurn >= 1) || (myTurn == 1 && n == 1)) { // Ensure that we are not taking too many
          n = n - myTurn;
          turn = 1; // then computer's turn
        } else {
          System.out.println("You're taking too many or less than one! The amount of marbles won't change.");
        }
        System.out.println("You took " + myTurn + " marbles");
      }  else { //if it's the computer's turn
         // Only one or two or three marbles left,
         // The only move that can be made is to take 1 marble
        if (n == 1 || n == 2 || n == 3) {
          n--;
        } 
        else if (smart == 0) { // If the computer is stupid
          if (n == 1) { // Only remove one marble if there is only one marble left
            compTurn = 1;
          } else {
            compTurn = 1 + r.nextInt((n / 2) - 1); // Range from [1, n / 2] = 1 + [0, n/2 - 1]
            n = n - compTurn;
          }
        }else { // If the computer is smart
                // In smart mode, the computer to make n one of the following:
                // [3, 7, 15, 31, 63]
          int[] pows = new int[] {3, 7, 15, 31, 63};
          for (int i = 4; i >= 0; i--) {
            if (pows[i] < n) { // Found the biggest pow of two that is less than n.
              compTurn = n - pows[i]; 
              break;
            }
          }
          n = n - compTurn;
        }
        System.out.println("The computer took " + compTurn + " marbles");
        turn = 0; // It's now the human's turn
      }
      System.out.println("There are " + n + " marbles left");
    }
    // At the time when n = 0, whoever's turn it is now has one since that last player took the last marble
    System.out.println((turn == 1 ? "Computer" : "Human") + " has won");
    in.close();
  }
}
