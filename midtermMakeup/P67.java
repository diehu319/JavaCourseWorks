import java.util.Random;
import java.util.Scanner;

public class P67{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int startingX = 0;
    int startingY = 0;
    System.out.print("Please enter number of steps: ");
    int steps = input.nextInt();

    for (int i = 0; i < steps; i++) {
      int direction = random.nextInt(4) + 1;
      if (direction == 1) {
        startingX += 1;
      }
      else if (direction == 2) {
        startingY += 1;
      }
      else if (direction == 3) {
        startingX -= 1;
      }
      else if (direction == 4) {
        startingY -= 1;
      }
    }
    System.out.printf("End point is: (%d, %d)", startingX, startingY);
    input.close();
  }
}