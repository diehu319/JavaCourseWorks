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

    public T find(int k){
        if (k == 1 + StageOne.size(this.left)) return this.value;
        else if (k <= StageOne.size(this.left)) return this.left.find(k);
        else return this.right.find(k - 1 - StageOne.size(this.left));
    }

    public static <T extends Comparable<T>> void main(String[] args){
        StageOne<Integer> root = new StageOne<Integer>(3);
        root.insert(5);
        root.insert(2);
        root.insert(4);
        root.insert(1);
        long startTime = System.nanoTime();
        System.out.println("The second node of the first tree has a value of " + root.find(2) + ", Expected: 2");
        long endTime = System.nanoTime();
        System.out.println("\nThe find method took " + (endTime - startTime) + " nanoseconds.");


        StageOne<String> newRoot = new StageOne<String>("c");
        newRoot.insert("b");
        newRoot.insert("a");
        newRoot.insert("d");
        newRoot.insert("e");
        System.out.println("\nThe third node of the second tree has a value of " + newRoot.find(3) + ", Expected: c");
        System.out.println("\nThe efficiency of my code is O(n). ");
    }
}
