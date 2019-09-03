//E1.17
import javax.swing.JOptionPane;
public class E117{
  public static void main(String[] args){
    String name = JOptionPane.showInputDialog("What is your name?");
    String thing = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
    System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
  }
}
//This program will ask the user to input the name first, then input what the user would likes to do.
//No matter what the user inputs for the thing they like to do, the program will print out sorry message with the input name.