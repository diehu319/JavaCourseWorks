public class BST<T extends Comparable<T>> {
  private Node<T> root;
  public BST() {
    this.root = null;
  }
  public BST(Node<T> node) {
    this.root = node;
  }
  public BST(T value) {
    this.root = new Node<T>(value);
  }
  public void insert(T value) {
    if (this.root == null)
      this.root = new Node<T>(value);
    else if (this.root.value().compareTo(value) > 0)
      this.root.left.insert(value);
    else if (this.root.value().compareTo(value) < 0)
      this.root.right.insert(value);
  }
  public String print() {
    if (this.root == null) return "()";
    else return "(" + this.root.print() + ")";
  }
  public String toString() {
    return this.root == null ? "" : this.root + "";
  }
  public static void main(String[] args) {
    BST<Integer> bst = new BST<Integer>();
    System.out.println(
            "                                            toString: " +
                    bst + "\nprint: " + bst.print());
    bst.insert(3);
    System.out.println(
            "                                            toString: " +
                    bst + "\nprint: " + bst.print());
    bst.insert(1);
    System.out.println(
            "                                            toString: " +
                    bst + "\nprint: " + bst.print());
    bst.insert(2);
    System.out.println(
            "                                            toString: " +
                    bst + "\nprint: " + bst.print());
    bst.insert(6);
    System.out.println(
            "                                            toString: " +
                    bst + "\nprint: " + bst.print());
    bst.insert(4);
    System.out.println(
            "                                            toString: " +
                    bst + "\nprint: " + bst.print());
  }
}

class Node<T extends Comparable<T>> {
  T value;
  BST<T> left, right;
  public Node(T value) {
    this.value = value;
    this.left = new BST<T>();
    this.right = new BST<T>();
  }
  public String toString() {
    return this.left + " " + this.value + " " + this.right;
  }
  public T value() {
    return this.value;
  }
  public String print() {
    return this.value + " " + this.left.print() + " " + this.right.print();
  }
}