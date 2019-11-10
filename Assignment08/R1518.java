import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class R1518{
  public static void main(String[] agrs){
    Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3));
    Set<Integer> B = new HashSet<>(Arrays.asList(2,3,4));
    Set<Integer> Intersection = new HashSet<>();
    Set<Integer> Union = new HashSet<>();
    System.out.println("Set A: " + A);
    System.out.println("Set B: " + B);
    
    Iterator i1 = A.iterator();
    Iterator i2 = B.iterator();
    
    while (i1.hasNext()){
      Integer a = (Integer)i1.next();
      Union.add(a);
      while (i2.hasNext()){
        Integer b = (Integer)i2.next();
        Union.add(b);
        if(B.contains(a)) Intersection.add(a);
        if(A.contains(b)) Intersection.add(b);
      }
    }
    System.out.println("The Intersection is " + Intersection);
    System.out.println("The Union is " + Union);
  }
}