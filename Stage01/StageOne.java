import java.util.*;

public class StageOne <T extends Comparable<T>> {
    T value;
    int size;
    StageOne<T> left, right;

    public StageOne (T value){
        this.value = value;
        this.size = 1;
    }

    public static <T extends Comparable<T>> int size(StageOne<T> root){
        if(root == null) return 0;
        else return root.size;
    }

    public void insert (T x){
        this.size++;
        if (x.compareTo(this.value) < 0){ //equivalent to "x < this.value"
            if (this.left == null) this.left = new StageOne<T>(x);
            else this.left.insert(x);
        }else if (x.compareTo(this.value) > 0){ //equivalent to "x > this.value"
            if (this.right == null) this.right = new StageOne<T>(x);
            else this.right.insert(x);
        }else {
            this.size--;
            System.out.println("Error: node with same value exist.");
        }
    }

    public static <T extends Comparable<T>> void inOrder (StageOne<T> root, List<T> a){
        if (root == null) return;
        else{
            inOrder(root.left, a);
            a.add(root.value); // the nodes in the left < in the right, so add nodes in the left first.
            inOrder(root.right, a);
        }
    }

    public T find(int k){
        if (k == 1 + StageOne.size(this.left)) return this.value;
        else if (k <= StageOne.size(this.left)) return this.left.find(k);
        else return this.right.find(k - 1 - StageOne.size(this.left));
    }

    public static <T extends Comparable<T>> void main(String[] args){
        StageOne<Integer> root = new StageOne<Integer>(3);
        root.insert(5);
        root.insert(2);
        root.insert(3);
        root.insert(1);
        System.out.println(root.find(2) + "Expected: 2");
        System.out.println("The efficiency of my code is O(n).");
    }
}
