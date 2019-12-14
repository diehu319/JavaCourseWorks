//E5.19
import java.util.*;
public class Card {

    public static void main(String[] args){
        getDescription();
    }

    static void getDescription() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card name notation: ");
        String input = in.nextLine();
        String value = input.substring(0,1);
        String suit = input.substring(1);
        if (input.contains("10")){
            value = input.substring(0,2);
            suit = input.substring(2);
        }
        String result;

        if (suit.equals("D")){
            if (value.equals("A")) System.out.println("Ace of Diamonds");
            else if (value.equals("J")) System.out.println("Jack of Diamonds");
            else if (value.equals("Q")) System.out.println("Queen of Diamonds");
            else if (value.equals("K")) System.out.println("King of Diamonds");
            else{
                int temp = Integer.parseInt(value);
                if (temp > 10 || temp < 2) System.out.println("Wrong value input");
                else {
                    System.out.println(temp + " of Diamonds");
                }
            }
        }else if (suit.equals("H")){
            if (value.equals("A")) System.out.println("Ace of Hearts");
            else if (value.equals("J")) System.out.println("Jack of Hearts");
            else if (value.equals("Q")) System.out.println("Queen of Hearts");
            else if (value.equals("K")) System.out.println("King of Hearts");
            else{
                int temp = Integer.parseInt(value);
                if (temp > 10 || temp < 2) System.out.println("Wrong value input");
                else {
                    System.out.println(temp + " of Hearts");
                }
            }
        }
        else if (suit.equals("S")){
            if (value.equals("A")) System.out.println("Ace of Spades");
            else if (value.equals("J")) System.out.println("Jack of Spades");
            else if (value.equals("Q")) System.out.println("Queen of Spades");
            else if (value.equals("K")) System.out.println("King of Spades");
            else{
                int temp = Integer.parseInt(value);
                if (temp > 10 || temp < 2) System.out.println("Wrong value input");
                else {
                    System.out.println(temp + " of Spades");
                }
            }
        }
        else if (suit.equals("C")){
            if (value.equals("A")) System.out.println("Ace of Clubs");
            else if (value.equals("J")) System.out.println("Jack of Clubs");
            else if (value.equals("Q")) System.out.println("Queen of Clubs");
            else if (value.equals("K")) System.out.println("King of Clubs");
            else{
                int temp = Integer.parseInt(value);
                if (temp > 10 || temp < 2) System.out.println("Wrong value input");
                else {
                    System.out.println(temp + " of Clubs");
                }
            }
        }
        else System.out.println("Invalid Input");
    }
}
