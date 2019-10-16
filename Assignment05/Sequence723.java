//E7.23
import java.util.*;
import java.util.ArrayList;

public class Sequence723{
  private ArrayList<Integer> values;
  public Sequence723() { values = new ArrayList<Integer>();}
  public void add(int n) { values.add(n); }
  public String toString() { return values.toString();}
  public Sequence723 append(Sequence723 other){
    Sequence723 a = new Sequence723();
    for (int i = 0; i < values.size(); i++){
      a.values.add(values.get(i));
    }
    for (int j = 0; j < other.values.size(); j++){
      a.values.add(other.values.get(j));
    }
    return a;
  }
  public Sequence723 merge(Sequence723 other){
    Sequence723 a = new Sequence723();
    if (other.values.size() < values.size()){
      for (int i = 0; i < values.size(); i++){
        a.values.add(values.get(i));
        a.values.add(other.values.get(i));
      }
      for (int j = other.values.size(); j > values.size(); j++){
        a.values.add(values.get(j));
      }
    }
    else if (other.values.size() > values.size()){
      for (int k = 0; k < values.size(); k++){
        a.values.add(values.get(k));
        a.values.add(other.values.get(k));
      }
      for (int m = other.values.size(); m > values.size(); m++){
        a.values.add(values.get(m));
      }
    }
    else{
      for (int n = 0; n < values.size(); n++){
        a.values.add(values.get(n));
        a.values.add(other.values.get(n));
      }
    }
    return a;
  }
}