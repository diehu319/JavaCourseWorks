//E6.22
import java.io.*;
import java.util.*;

public class E622 {
  public static void main(String[] args) {
    Random RandomNumber = new Random();
    int noOftrials = 1000; //1,000 iterations
    
    System.out.println("Player never changes the door.");
    int noOfwins = 0; //if not changed, win + 1
    for (int i = 1; i <= noOftrials; i++) { 
      int prize_door = RandomNumber.nextInt(3); //nextInt(int n) from 0(inclusive) to n(exclusive)
      int contestant_door = RandomNumber.nextInt(3);
      if (contestant_door == prize_door) noOfwins++; //if the unchanged selected door is the prize door win++
    }
    System.out.println("Total Wins out of " + noOftrials + ": " + noOfwins);
    System.out.println("Percent win: "+ (double) noOfwins / noOftrials);
    System.out.println("");
    
    System.out.println("Player always changes the door.");
    noOfwins = 0;
    for (int i = 1; i <= noOftrials; i++) {
      int prize_door = RandomNumber.nextInt(3);
      int contestant_door = RandomNumber.nextInt(3);
      // Here, we randomly look for doors until we find one that that is wrong, yet still wasn't picked by the contestant.
      int wrong_door = prize_door;
      while (wrong_door == prize_door || wrong_door == contestant_door) {
        wrong_door = RandomNumber.nextInt(3);
      }
      int switched_door = 3 - (contestant_door + wrong_door); //the door that switched to (new selected door)
      // Always switch doors!
      if (switched_door == prize_door) noOfwins++;
    }
    System.out.println("Total Wins out of " + noOftrials + ": " + noOfwins);
    System.out.println("Percent win: "+ (double) noOfwins / noOftrials);
  }
}