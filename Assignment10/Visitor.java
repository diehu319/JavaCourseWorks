import java.util.Random;

public interface Visitor {
    void visit(int obj);
}

class BinarySearchTree implements Visitor {
    int value;
    BinarySearchTree left, right;

    public BinarySearchTree(int value, BinarySearchTree left, BinarySearchTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static int size(BinarySearchTree node) {
        if (node == null) return 0;
        else return 1 + BinarySearchTree.size(node.left) + BinarySearchTree.size(node.right);
    }

    public int find(int k) {
        if (k == 1 + BinarySearchTree.size(this.left)) return this.value;
        else if (k <= BinarySearchTree.size(this.left)) {
            return this.left.find(k);
        } else {
            return this.right.find(k - 1 - BinarySearchTree.size(this.left));
        }
    }

    public void insert(int value) {
        if (this.value != value) {
            if (value < this.value) {
                if (this.left == null) this.left = new BinarySearchTree(value, null, null);
                else this.left.insert(value);
            } else {
                if (this.right == null) this.right = new BinarySearchTree(value, null, null);
                else this.right.insert(value);
            }
        }
    }

    public String print() {
        return "(" + this.value + " " +
                ((this.left == null) ? "." : this.left.print()) + " " +
                ((this.right == null) ? "." : this.right.print()) + ")";
    }

    public String toString() {
        return this.left + " " + this.value + " " + this.right;
    }

//    public static void generate(int num){
//        Random rand = new Random();
//        BinarySearchTree bst = new BinarySearchTree(rand.nextInt(),null,null);
//        for (int i = 1; i < num; i++){
//            int node = rand.nextInt(100);
//            bst.insert(node);
//    }
//
//    private static void preorder(BinarySearchTree bst, Visitor v) {
//        if (bst.left == null) {
//            if (bst.right == null) v.visit(bst.value); //all null tree
//            else {
//                v.visit(bst.value);
//                preorder(bst.right, v);
//            }
//        } else {
//            if (bst.right == null) { //only right is null
//                v.visit(bst.value);
//                preorder(bst.left, v);
//            } else { //both sides of the tree is not null
//                v.visit(bst.value);
//                preorder(bst.left, v);
//                preorder(bst.right, v);
//            }
//        }
//    }
//
//    public void preorder(Visitor v) {
//        v.visit(this.value);
//        if (this.left != null) preorder(this.left, v);
//        if (this.right != null) preorder(this.right, v);
//    }

    public void visit(int obj){

    }

    public static void main(String[] args) {
        Random rand = new Random();
        BinarySearchTree bst = new BinarySearchTree(rand.nextInt(), null, null);
        for (int i = 1; i < 15; i++) {
            int node = rand.nextInt(100);
            bst.insert(node);
        }
        System.out.println(bst);
    }
}

