import java.util.Scanner;

public class E614{
  public static void main(String[] args){        
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer");
    while (!scan.hasNextInt()) // while non-integers are present
    {
      scan.next();
      System.out.println ("Bad input. Enter an integer.");
    }
    int i = scan.nextInt();  // Read input outside the while loop
    while (i>0) // while greater than 0
    {
      System.out.println (i%2);
      i = i/2; 
    }
  }
}