import java.util.Random;
import java.util.Scanner;

public class P66{
  public static final Random r = new Random();
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int marbles = r.nextInt(91) + 10;
    int turn = r.nextInt(2); // 0-computer, 1-human
    int smart = r.nextInt(2); // 0-stupid, 1-smart
    System.out.println("Total marbles: " + marbles);
    System.out.println("The computer plays " + (smart == 0 ? "stupid" : "smart") + ".");
    System.out.println("------------------------------------------------------");
    
    while (marbles > 1) { // when we have more than 1 marble left
      int myTake = 1;
      int compTake = 1;
      if (turn == 0){ //computer'input turn
        if (smart == 0) compTake = r.nextInt(marbles/2) + 1; // stupid mode - legal move
        else{ // smart mode
          if ((marbles + 1) % 2 == 0) compTake = r.nextInt(marbles / 2) + 1; // Legal move
          else{
            for (int i = 1; i <= marbles/2; i++){ //Find the biggest 2^n-1 that smaller than total amount of marbles
              if (((marbles - i) + 1) % 2 == 0) compTake = i;
            }
          }
        }
        System.out.println("The computer takes " + compTake + " marble.");
        marbles -= compTake;
      }else{ // my turn
        while(true){
          System.out.print("How many marbles do you want to take: ");
          myTake = input.nextInt();
          if (myTake >= 1 && myTake <= marbles/2) break;
          else{ System.out.println("Illegal move!");}
        }
      System.out.println("You take " + myTake + " marbles.");
      marbles -= myTake;
      }
      turn = (turn + 1) % 2;
      System.out.println("Marbles remained: " + marbles);
      System.out.println("--------------------------------------------------");
    }
    
    //Last marble left
    if (turn == 0){
      System.out.println("The computer took the last marble.");
      System.out.println("Human wins.");
    }else{
      System.out.println("You took the last marble.");
      System.out.println("Computer wins.");
    }
    input.close();
  }
}
