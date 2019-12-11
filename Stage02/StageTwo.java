public class StageTwo {
    int value;
    StageTwo left, right;
    int before, // size of the left subtree
            after; // size of the right subtree
    public StageTwo(int value, StageTwo left, StageTwo right) {
        this.value = value;
        this.right = right;
        this.left = left;
        this.before = StageTwo.size(left);
        this.after = StageTwo.size(right);
    }
    public static int size(StageTwo boom) {
        if (boom == null) return 0;
        else return 1 + StageTwo.size(boom.left) + StageTwo.size(boom.right);
    }
    public static StageTwo make(int lo, int hi) {
        if (hi < lo) return null;
        int middle = (hi + lo) / 2;
        return new StageTwo(middle, StageTwo.make(lo, middle-1), StageTwo.make(middle+1, hi));
    }
    public String print() {
        return "(" + this.value + " " +
                ((this.left == null) ? "." : this.left.print()) + " " +
                ((this.right == null) ? "." : this.right.print()) + ")";
    }
    public int find(int k) {
        if (k == 1 + this.before) return this.value;
        else if ( k <= this.before) {
            return this.left.find(k);
        } else {
            return this.right.find( k - 1 - this.before);
        }
    }
    public static void main(String[] args) {
        int size = Integer.parseInt( args[0] );
        StageTwo boom = StageTwo.make(1, Integer.parseInt(args[0]));
        System.out.println( boom.print() );
    }
}
