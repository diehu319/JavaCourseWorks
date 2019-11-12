public class Testing{
  public static void main(String[] args){
    
    LispList list1 = new EmptyList();
    System.out.println("Print list1 = " + list1 + "; Expected: ");
    
    LispList list2 = new NonEmptyList(1, new EmptyList());
    System.out.println("Print list2 = " + list2 + "; Expected: 1");
   
    LispList list3 = new NonEmptyList(5, new NonEmptyList(6, new EmptyList()));
    System.out.println("Print list3 = " + list3 +"; Expected: 5 6");
    
    LispList list4 = LispList.NIL.cons(4).cons(3).cons(2).cons(1);
    System.out.println("Print list4 = " + list4 +"; Expected: 1 2 3 4");
    
    //merging 
    System.out.println("Merge list4 and list3 = " + list4.merge(list3) + "; Expected: 1 5 2 6 3 4");
    
    //contains
    System.out.println("If list2 contains 3 is " + list2.contains(3) + "; Expected: false");
    System.out.println("If list4 contains 3 is " + list4.contains(3) + "; Expected: true");

    //length
    System.out.println("The length of list1 = " + list1.length() + "; Expected: 0");
    System.out.println("The length of list2 = " + list2.length() + "; Expected: 1");
    System.out.println("The length of list3 = " + list3.length() + "; Expected: 2");
    System.out.println("The length of list4 = " + list4.length() + "; Expected: 4");
  }
}