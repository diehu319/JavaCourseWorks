public class Test{
  public static void main(String[] args){
    Sequence724 a = new Sequence724();
    a.add(1);
    a.add(4);
    a.add(9);
    a.add(16);
    Sequence724 b = new Sequence724();
    b.add(9);
    b.add(7);
    b.add(4);
    b.add(9);
    b.add(11);
    System.out.println("E7.22 Output: " + a.append(b) + " Expected: [1,4,9,16,9,7,4,9,11].");
    System.out.println(a.merge(b));
    Sequence724 c = new Sequence724();
    c.add(4);
    c.add(7);
    c.add(9);
    c.add(9);
    c.add(11);
    System.out.println("E7.24 Output: " + a.mergeSorted(c) + " Expected: [1,4,4,7,9,9,9,11,16].");
  }
}