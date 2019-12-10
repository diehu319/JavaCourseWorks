//E519
import java.util.*;
public class Card {

    public static void main(String[] args){
        getDescription();
    }

    static String getDescription() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card name notation: ");
        String input = in.nextLine();
        in.close();
        String suit = input.substring(1);
        String value = input.substring(0,1);
        String result;
        if(suit.equals("D")){
            if(value.equals("J")){
                result = "Jack of Diamonds";
                return result;
            }else if (value.equals("Q")){
                result = "Queen of Diamonds";
                return result;
            }else if (value.equals("K")){
                result = "King of Diamonds";
                return result;
            }else {
                result = value + " of Diamonds";
                return result;
            }
        }
        else if(suit.equals("H")){
            if(value.equals("J")){
                result = "Jack of Hearts";
                return result;
            }
            else if (value.equals("Q")){
                result = "Queen of Hearts";
                return result;
            }else if (value.equals("K")){
                result = "King of Hearts";
                return result;
            }else {
                result = value + " of Hearts";
                return result;
            }
        }else if(suit.equals("S")){
            if(value.equals("J")){
                result = "Jack of Spades";
                return result;
            }else if (value.equals("Q")){
                result = "Queen of Spades";
                return result;
            }else if (value.equals("K")){
                result = "King of Spades";
                return result;
            }else {
                result = value + " of Spades";
                return result;
            }
        }else if(suit.equals("C")){
            if(value.equals("J")){
                result = "Jack of Clubs";
                return result;
            }else if (value.equals("Q")){
                result = "Queen of Clubs";
                return result;
            }else if (value.equals("K")){
                result = "King of Clubs";
                return result;
            }else {
                result = value + " of Clubs";
                return result;
            }
        }else {
            result = "Unkown";
            return result;
        }
    }
}
