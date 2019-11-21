//P6.10
// Why did he, on average, lose a bet that at least one six would appear when rolling a die four times? 
// And why did he seem to win a similar bet, getting at least one double-six when rolling a pair of dice 24 times?
// Simulate each game a million times and print out the wins and losses.

import java.util.Random;

public class P610{
  static Random r = new Random();
  public static void main(String[] agrs){
    experiment1(); //the first experiment
    experiment2(); //the second experiment
  }
  
  public static void experiment1(){
    int n = 1000000;
    int loss = 0;
    int win = 0;
    
    for (int i = 0; i < n; i++){
      boolean seen_six = false;
      for (int j = 0; j < 4; j++){ //rolling a dice four times
        int dice = r.nextInt(6) + 1; // from 0(inclusive) to 6(exclusive)
        if (dice == 6){ //win when one six appears
          seen_six = true;
          break;
        }
      }
      if (seen_six){
        win++;
      }else{
        loss++;
      }
    }
    System.out.println("Experiment 1 wins: " + win);
    System.out.println("Experiment 1 losses: " + loss);
  }
  
  public static void experiment2(){
    int n = 1000000;
    int loss = 0;
    int win = 0;
    
    for (int i = 0; i < n; i++){
      boolean seen_two_six = false;
      for (int j = 0; j < 24; j++){ //roll a pair of dice 24 times
        int dice1 = r.nextInt(6) + 1;
        int dice2 = r.nextInt(6) + 1;
        if (dice1 == 6 && dice2 == 6){ // win when one double-six appears
          seen_two_six = true;
          break;
        }
      }
      if (seen_two_six){
        win++;
      }else{
        loss++;
      }
    }
    System.out.println("Experiment 2 wins: " + win);
    System.out.println("Experiment 2 losses: " + loss);
  }
}
