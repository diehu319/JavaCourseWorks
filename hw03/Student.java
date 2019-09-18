//P3.7
import javax.swing.JOptionPane;
public class Student
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("What is the name?");
    int score = 0;
    int quiz = 0;
  }
  public void getName(){
    System.out.println(name);
  }
  public int addQuiz(int num){
    quiz += 1;
    score += num
  }
  public int getTotalScore(){
    return score;
  }
  public int getAverageScore(){
    return score/quiz;
  }
}