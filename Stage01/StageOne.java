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
}
