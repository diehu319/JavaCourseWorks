import java.io.*;
import java.util.*;


public class Lab7{
  public static void main(String[] args) throws FileNotFoundException{
    if(args.length > 1){
      hasNumInput(args[0], Integer.parseInt(args[1]));
    }else{
      onlyStrInput(args[0]);
    }
  }

  public static void onlyStrInput(String filename) throws FileNotFoundException{
    File file = new File(filename);
    Scanner inFile = new Scanner(file);
    HashMap<String, Integer> map = new HashMap<>();
    String input = "";
    while (inFile.hasNext()){
      input = inFile.next();
      if (!map.containsKey(input)) map.put(input,1);
      else map.put(input, map.get(input) + 1);
    }

    int index = 1;
    while (!map.isEmpty()) {
      int max = 0;
      String maxP = "";
      for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
        Map.Entry entry = (Map.Entry) stringIntegerEntry;
        String key = (String) entry.getKey();
        Integer value = (Integer) entry.getValue();
        //if equals, alphabetically
        if (value == max) {
          if (maxP.compareTo(key) > 0) {
            max = value;
            maxP = key;
          }
        }
        if (value > max) {
          max = value;
          maxP = key;
        }
      }
      System.out.println(index++ + ". " + maxP + " = " + map.get(maxP));
      //pop out the max
      map.remove(maxP);
    }
  }

  public static void hasNumInput(String filename, int num) throws FileNotFoundException{


    File file = new File(filename);
    Scanner inFile = new Scanner(file);
    HashMap<String, Integer> map = new HashMap<>();
    String input = "";
    while (inFile.hasNext()){
      input = inFile.next();
      if (!map.containsKey(input)) map.put(input,1);
      else map.put(input, map.get(input) + 1);
    }

    int index = 1;
    while (!map.isEmpty() && num > 0) {
      int max = 0;
      String maxP = "";

      for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
        Map.Entry entry = (Map.Entry) stringIntegerEntry;
        String key = (String) entry.getKey();
        Integer value = (Integer) entry.getValue();

        if (value == max) {          //if equals, alphabetically
          if (maxP.compareTo(key) > 0) {
            max = value;
            maxP = key;
          }
        }
        if (value > max) {
          max = value;
          maxP = key;
        }
      }

      System.out.println(index++ + ". " + maxP + " = " + map.get(maxP));
      map.remove(maxP);  //pop out the max
      num--;
    }
  }
}