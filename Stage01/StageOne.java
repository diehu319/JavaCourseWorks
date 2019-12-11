import java.util.*;

public class StageOne {
    int value;
    StageOne left, right;

    public StageOne (int value){ this.value = value;}

    public void insert (int x){
        if (x < this.value){
            if (this.left == null) this.left = new StageOne(x);
            else this.left.insert(x);
        }else if (x > this.value){
            if (this.right == null) this.right = new StageOne(x);
            else this.right.insert(x);
        }else System.out.println("Error: node with same value exist.");
    }

    public static void inOrder (StageOne root, List<Integer> a){
        if (root == null) return;
        else{
            inOrder(root.left, a);
            a.add(root.value); // the nodes in the left < in the right, so add nodes in the left first.
            inOrder(root.right, a);
        }
    }

    public int find(int k){
        List<Integer> list = new ArrayList<>();
        StageOne.inOrder(this,list);
        System.out.println(list);
        return list.get(k-1);
    }

    public static void main(String[] args){
        StageOne root = new StageOne(4);
        root.insert(5);
        root.insert(2);
        root.insert(3);
        root.insert(1);
        System.out.println(root.find(2));
    }
}
