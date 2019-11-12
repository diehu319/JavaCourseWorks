import java.util.*;

class NonEmptyList implements LispList{
  private Object head;
  private LispList tail;
  
  //constructor
  public NonEmptyList(Object Obj, LispList lst){
    head = Obj;
    tail = lst;
  }
  
  public LispList cons(Object obj1){
    return new NonEmptyList(obj1, this);
  }
  
  public boolean empty(){
    return false;
  }
  
  public Object head(){
    return this.head;
  }
  
  public LispList tail(){
    return this.tail;
  }
  
  //method to print
  public String toString(){
    return this.head() + " " + this.tail().toString();
  }
  
  //method to return the length
  public int length(){
    return 1 + this.tail.length();
  }
  
  //method to merge two list
  public LispList merge(LispList other){
    return new NonEmptyList(head, other.merge(tail));
  }
  
  //method to check if the list contains an element or not
  public boolean contains(Object obj){
    if (this.head() == obj) return true;
    else return this.tail.contains(obj);
  }
}