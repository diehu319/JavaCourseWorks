//E7.22
import java.util.*;
import java.util.ArrayList;

public class Sequence{
  private ArrayList<Integer> values;
  public Sequence() { values = new ArrayList<Integer>();}
  public void add(int n) { values.add(n); }
  public String toString() { return values.toString();}
  public Sequence append(Sequence other){
    Sequence a = new Sequence();
    for (int i = 0; i < values.size(); i++){
      a.add(values.get(i));
    }
    for (int j = 0; j < other.values.size(); j++){
      a.add(other.values.get(j));
    }
    return a;
  }
}