//P3.7
import java.util.Scanner;
public class Student
{
  public int score = 0;
  Scanner input = new Scanner(System.in);

  public static void main(String[] args)
  {
    Scanner b = new Scanner(System.in);
    Student a = new Student();
    a.getName();
    System.out.println("How many quizzes the student took: ");
    int numOfQuiz = b.nextInt();
    a.addQuiz(numOfQuiz);
    a.getTotalScore();
    a.getAverageScore(numOfQuiz);
  }

  public void getName(){
    System.out.println("Enter the name of the student: ");
    String name = input.nextLine();
    System.out.println("The name of the student is " + name);
  }

  public void addQuiz(int num){
    for (int i = 0; i < num; i++){
      System.out.println("What quiz score the student get: ");
      int quiz = input.nextInt();
      score += quiz;
      System.out.println("You add a quiz of " + quiz + " for the student, the total score now is " + score);
    }
  }

  public void getTotalScore(){
    System.out.println("The total score for the student is " + score);
  }
  public void getAverageScore(int i){
    System.out.println("The average score for the student is " + score/i);
  }
}