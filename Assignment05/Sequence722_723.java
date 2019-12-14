import java.util.ArrayList;
import java.util.Collections;

public class Sequence722_723 {
    //initialize
    private ArrayList<Integer> values;
    public Sequence722_723() { values = new ArrayList<Integer>(); }
    public void add(int n) { values.add(n); }
    public String toString() { return values.toString(); }

    //E7.22
    public Sequence722_723 append(Sequence722_723 other) {
        Sequence722_723 c = new Sequence722_723();
        for (int i = 0; i < this.values.size(); ++i){
            c.add(this.values.get(i));
        }
        for (int i = 0; i < other.values.size(); ++i){
            c.add(other.values.get(i));
        }
        return c;
    }

    //E7.23
    public Sequence722_723 merge(Sequence722_723 other) {
        Sequence722_723 c = new Sequence722_723();

        if (this.values.size() == other.values.size()){ //if this and other same length
            for (int i = 0; i < this.values.size(); ++i){
                c.add(this.values.get(i));
                c.add(other.values.get(i));
            }

        }else if (this.values.size() < other.values.size()){ //if this is shorter than other
            for (int i = 0; i < this.values.size(); ++i){
                c.add(this.values.get(i));
                c.add(other.values.get(i));
            }
            for (int j = this.values.size(); j < other.values.size(); ++j){ //add the rest
                c.add(other.values.get(j));
            }

        }else{ // if this is longer than other
            for (int i = 0; i < other.values.size(); ++i){
                c.add(this.values.get(i));
                c.add(other.values.get(i));
            }
            for (int j = other.values.size(); j < this.values.size(); ++j){ //add the rest
                c.values.add(this.values.get(j));
            }
        }

        return c;
    }

    public static void main(String[] args){
        Sequence722_723 a = new Sequence722_723();
        Sequence722_723 b = new Sequence722_723();
        Sequence722_723 c = new Sequence722_723();

        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(a.append(b));
        System.out.println(a.merge(b));
    }
}