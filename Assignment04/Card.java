//E519
import java.util.Scanner;
public class Card{
    public static void main(String[] args){
        getDescription();
    }
    
    static String getDescription(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card name notation: ");
        String input = in.nextLine();
        String suit = input.substring(1,2);
        String value = input.substring(0,1);
        String sum = "";
        String error = "Input Format Incorrect or Invalid Input Value";
        if (value.equals("A")) sum = "Ace of ";
        else if (value.eqauls("J")) sum = "Jack of ";
        else if (value.equals("Q")) sum = "Queen of ";
        else if (value.equals("K")) sum = "King of ";
        else if (bool ("2","3","4","5","6","7","8","9","10").contains(value)) sum = value + " of ";
        else sum = "";
        if (suit.equals("D")) sum += "Diamonds";
        else if (suit.equals("H")) sum += "Hearts";
        else if (suit.equals("S")) sum += "Spades";
        else if(suit.equals("Clubs")) sum += "Clubs";
        else sum = "";
        if (sum != "") return sum;
        else return error;
    }
}


//I refer the idea from http://forum.codecall.net/topic/59934-card-program-help/  But my code didn't work out, I will go to office hour for help soon.