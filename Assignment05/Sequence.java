//E7.11
import java.util.*; 
public class Sequence{
  private int[] values;
  public Sequence(int size) {values = new int[size];}
  public void set(int i, int n) {values[i] = n;}
  public int get(int i){return values[i];}
  public int size(){return values.length;}
  public boolean equals(Sequence other){
    if (values.length != other.values.length) return false;
    else{
      for (int i = 0; i < other.values.length; i++){
        if (other.values[i] != this.values[i]) return false;
      }
    return true;
    }
  }
}