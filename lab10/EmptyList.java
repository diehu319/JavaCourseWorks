class EmptyList implements LispList{
  public EmptyList(){
  
  }
 
  public LispList cons(Object obj1){
    return new NonEmptyList (obj1, this);
  }
  
  public boolean empty(){
    return true;
  }
  
  //throw exception since it is a empty list
  public Object head(){
    throw new UnsupportedOperationException();
  }
  
  //throw exception since it is a empty list
  public LispList tail(){
    throw new UnsupportedOperationException();
  }
  
  //method to print
  public String toString(){
    return "";
  }
  
  //method to return the length
  public int length(){
    return 0;
  }
  
  //merges two lists
  public LispList merge(LispList other){
    return other;
  }
  
  //method to check if the list contains an element or not
  public boolean contains(Object obj){
    return false;
  }
}