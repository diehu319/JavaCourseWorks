import java.util.Scanner;
public class BST {
  int value; 
  BST left, right; 
  
  public BST(int value, BST left, BST right) {
   this.value = value; 
   this.left = left;
   this.right = right; 
  }
  
  public static int size(BST node) {
    if (node == null) return 0; 
    else return 1 + BST.size(node.left) + BST.size(node.right); 
  }
  
  public int find(int k) {
    if (k == 1 + BST.size(this.left)) return this.value; 
    else if ( k <= BST.size(this.left)) {
      return this.left.find(k); 
    } else {
      return this.right.find( k - 1 - BST.size(this.left)); 
    }
  }
  
    public void insert(int value) {
    if (this.value == value) { 
      return;  
    } else {
      if (value < this.value) { 
        if (this.left == null) {
          this.left = new BST(value, null, null);
          return; 
        } else this.left.insert(value); 
      } else {
        if (this.right == null) {
          this.right = new BST(value, null, null);
          return; 
        } else this.right.insert(value); 
      }
    }
  }
  
  public String print() {
    return "(" + this.value + " " + 
                 ((this.left == null) ? "." : this.left.print()) + " " + 
                 ((this.right == null) ? "." : this.right.print())  + ")";  
  }
  
  public String toString() {
    return this.left + " " + this.value + " " + this.right;  
  }
  
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("How many node do you want: ");
    int numNode = a.nextInt();
    System.out.println("Which root node do you want: ");
    int root = a.nextInt();
    BST bst = new BST(root,null,null);
    System.out.println("Here's your tree right now: " + bst);
    System.out.println("The size of your tree is: " + BST.size(bst));
    for (int i = 1; i < numNode; i++){
      System.out.println("Enter your node value: ");
      int node = a.nextInt();
      bst.insert(node);
      System.out.println("Here's your tree right now: " + bst);
      System.out.println("The size of your tree is: " + BST.size(bst));
    }
    System.out.println("Which position of the node you want to find: ");
    int position = a.nextInt() - 1;
    System.out.println("This is the node you looking for: " + bst.find(position));
    System.out.println(bst.print());
    a.close();
  }  
}
// The efficiency of the program is O(n)