//P6.9
// Generate the lower point of the needle. Its x-coordinate is irrelevant, and you may assume its y-coordinate
// ylow to be any random number between 0 and 2. The angle ¦Ábetween the needle and the x-axis can be any value 
// between 0 degrees and 180 degrees (¦Ð radians). The upper end of the needle has y-coordinate
//    yhigh = ylow + sin¦Á
// The needle is a hit if yhigh is at least 2, as shown in Figure 11. Stop after 10,000 tries and print the 
// quotient tries/hits.

import java.util.Random; 
  
public class P69{
  public static void main(String[] agrs){
    buffon();
  }
  
  public static void buffon(){
    double tries = 10000; // 10000 tries
    double hits = 0;
    
    Random r = new Random();
    for (int i = 0; i < tries; i++){
      double y_low = 2 * r.nextDouble(); //generate random double between 0(inclusive) and 2(exclusive)
      double angle = 180 * r.nextDouble();
      double y_high = y_low + Math.sin(Math.toRadians(angle));
      if (y_high >= 2){
        hits++;
      }
    }
    System.out.println(tries / hits);
  }
}