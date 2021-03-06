//public class StageTwo {
//    int value;
//    StageTwo left, right;
//    int before, // size of the left subtree
//            after; // size of the right subtree
//    public StageTwo(int value, StageTwo left, StageTwo right) {
//        this.value = value;
//        this.right = right;
//        this.left = left;
//        this.before = StageTwo.size(left);
//        this.after = StageTwo.size(right);
//    }
//    public static int size(StageTwo boom) {
//        if (boom == null) return 0;
//        else return 1 + StageTwo.size(boom.left) + StageTwo.size(boom.right);
//    }
//    public static StageTwo make(int lo, int hi) {
//        if (hi < lo) return null;
//        int middle = (hi + lo) / 2;
//        return new StageTwo(middle, StageTwo.make(lo, middle-1), StageTwo.make(middle+1, hi));
//    }
//    public String print() {
//        return "(" + this.value + " " +
//                ((this.left == null) ? "." : this.left.print()) + " " +
//                ((this.right == null) ? "." : this.right.print()) + ")";
//    }
//    public int find(int k) {
//        if (k == 1 + this.before) return this.value;
//        else if ( k <= this.before) {
//            return this.left.find(k);
//        } else {
//            return this.right.find( k - 1 - this.before);
//        }
//    }
//    public static void main(String[] args) {
//        int size = Integer.parseInt( args[0] );
//        StageTwo boom = StageTwo.make(1, Integer.parseInt(args[0]));
//        System.out.println( boom.print() );
//    }
//}

import java.util.*;

public class StageTwo <T extends Comparable<T>> {
    T value;
    int size;
    StageTwo<T> left, right;

    public StageTwo (T value){
        this.value = value;
        this.size = 1;
    }

    public static <T extends Comparable<T>> int size(StageTwo<T> root){
        if(root == null) return 0;
        else return root.size;
    }

    public void insert (T x){
        this.size++;
        if (x.compareTo(this.value) < 0){ //equivalent to "x < this.value"
            if (this.left == null) this.left = new StageTwo<T>(x);
            else this.left.insert(x);
        }else if (x.compareTo(this.value) > 0){ //equivalent to "x > this.value"
            if (this.right == null) this.right = new StageTwo<T>(x);
            else this.right.insert(x);
        }else {
            this.size--;
            System.out.println("Error: node with same value exist.");
        }
    }

    public static <T extends Comparable<T>> void inOrder (StageTwo<T> root, List<T> a){
        if (root == null) return;
        else{
            inOrder(root.left, a);
            a.add(root.value); // the nodes in the left < in the right, so add nodes in the left first.
            inOrder(root.right, a);
        }
    }

    public T StageOneFind(int k){
        if (k == 1 + StageTwo.size(this.left)) return this.value;
        else if (k <= StageTwo.size(this.left)) return this.left.StageOneFind(k);
        else return this.right.StageOneFind(k - 1 - StageTwo.size(this.left));
    }

    public T StageTwoFind(int k){
        List<T> a = new ArrayList<>();
        StageTwo.inOrder(this,a);
        return a.get(k-1);
    }

    public static <T extends Comparable<T>> void main(String[] args){
        StageTwo<Integer> root = new StageTwo<Integer>(3);
        root.insert(5);
        root.insert(2);
        root.insert(4);
        root.insert(1);
        long startTime = System.nanoTime();
        System.out.println("The second node of the first tree has a value of " + root.StageOneFind(2) + ", Expected: 2");
        long endTime = System.nanoTime();
        System.out.println("\nThe Stage one find method took " + (endTime - startTime) + " nanoseconds.");

        startTime = System.nanoTime();
        System.out.println("The second node of the first tree has a value of " + root.StageTwoFind(2) + ", Expected: 2");
        endTime = System.nanoTime();
        System.out.println("\nThe Stage two find method took " + (endTime - startTime) + " nanoseconds.");
    }
}
