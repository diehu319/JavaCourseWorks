//E7.12
import java.util.*; 
public class Sequence712{
  private int[] values;
  public Sequence712(int size) {values = new int[size];}
  public void set(int i, int n) {values[i] = n;}
  public int get(int i){return values[i];}
  public int size(){return values.length;}
  public boolean equals(Sequence712 other){
    if (values.length != other.values.length) return false;
    else{
      for (int i = 0; i < other.values.length; i++){
        if (other.values[i] != this.values[i]) return false;
      }
    return true;
    }
  }
  public boolean sameValues(Sequence712 other){
    if (values.equals(other)) return true;
    else{
      if (values.length == other.values.length){ // if two sequences are the same length
        for (int i = 0; i < values.length; i++){
          for(int g = 0; g < other.values.length; g++){
          if (other.values[g] == values[i]) return true;
          else return false;
        }
       }
      }
      else{ 
        if (values.length != other.values.length){ // if the length of Sequences are different
          for (int j = 0; j < values.length; j++){
            for (int k = 0; k < other.values.length; k++){
              if (other.values[k] == values[j]) return true;
              else return false;
            }
          }
        return false;
        }
      }
     }
    return false;
  }
}
