import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class R1519{
  public static void main(String[] agrs){
    Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3));
    Set<Integer> B = new HashSet<>(Arrays.asList(2,3,4));
    System.out.println("Set A: " + A);
    System.out.println("Set B: " + B);
    System.out.println(union(A,B));
    System.out.println(intersection(A,B));
  }
  
  public static <T> Set<T> union(Set<T> A, Set<T> B){
    return new HashSet<T>(){{
      addAll(A);
      addAll(B);
    }};
  }
  
  public static <T> Set<T> intersection(Set<T> A, Set<T> B){
    A.retainAll(B);
    return B;
  }
}