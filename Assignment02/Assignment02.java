import java.util.Scanner;

public class Assignment02 {
  public static void main(String[] args) {
    Scanner ollie;
    ollie = new Scanner(System.in);
    // System.out.println( ollie ); 
    System.out.print("Enter the first time:(xx:xx) "); 
    String first = ollie.nextLine(); 
    int firstHour = Integer.parseInt(first.substring(0,2));
    int firstMin = Integer.parseInt(first.substring(3));
    System.out.print( "Enter the second time:(xx:xx) ");
    String second = ollie.nextLine(); 
    int secondHour = Integer.parseInt(second.substring(0,2));
    int secondMin = Integer.parseInt(second.substring(3));
    
    int firstTotalMin = firstHour * 60 + firstMin;
    int secondTotalMin = secondHour * 60 + secondMin;
    //System.out.println("first: " + firstHour + " min: " + firstMin +" second: " + secondHour);
    if ((firstHour == secondHour) & (firstMin == secondMin)) System.out.println ("0 hours and 0 minutes.");
    else if (firstHour < secondHour)
      //diff = ((secondHour * 60 + secondMin) - (firstHour * 60 + firstMin));
      System.out.println((secondTotalMin - firstTotalMin) / 60 + " hours and " + (secondTotalMin - firstTotalMin) % 60 + " minutes.");
    else
      System.out.println( ((24 * 60 - firstTotalMin) + (secondTotalMin - 0)) / 60+ " hours and " + ((24 * 60 - firstTotalMin) + (secondTotalMin - 0)) % 60 + " minutes.");
  }
}