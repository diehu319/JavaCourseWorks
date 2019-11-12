public interface LispList{
  LispList NIL = new EmptyList();
  boolean empty();
  Object head();
  LispList tail();
  LispList cons(Object Obj);
  int length();
  LispList merge(LispList other);
  boolean contains(Object Obj);
}