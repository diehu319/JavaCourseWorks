public class Sequence711_713{
    //initialize
    private int[] values;
    public Sequence711_713(int size) { values = new int[size]; }
    public void set(int i, int n) { values[i] = n; }
    public int get(int i) { return values[i]; }
    public int size() { return values.length; }

    //E7.11
    public boolean equals(Sequence711_713 other){
        boolean equal = false;
        if (this.size()!=other.size()) return equal;
        else{
            for(int i = 0; i < this.size(); i++){
                if (this.get(i) == other.get(i)) equal = true;
                else {
                    equal = false;
                    break;
                }
            }
            return equal;
        }
    }

    //E7.12
    public boolean sameValues(Sequence711_713 other){
        for (int i = 0; i < this.size(); i++){
            int j = 0;
            for (; j < other.size(); j++){
                if (this.get(i) == other.get(j)) break;//break the for loop and return true in the end
            }
            if (j == other.size()) return false; //if cannot enter the 2nd for loop, return false
        }
        return true;//return true if goes through all the loop
    }

    //E7.13
    public boolean isPermutationOf(Sequence711_713 other){
        boolean result = false;
        if (this.size() != other.size()) result = false; //if length is not equaled, return false
        else{
            int sum1 = 0, sum2 = 0, mult1 = 1, mult2= 1;
            for (int i = 0; i < this.size(); i++){
                sum1 += this.get(i);
                mult1 *= this.get(i);
            }
            for (int j = 0; j < other.size(); j++){
                sum2 += other.get(j);
                mult2 *= other.get(j);
            }
            if ((sum1 == sum2) && (mult1 == mult2)) result = true; // if the value in both arrays have equal sum and multi, they are permutation
        }
        return result;
    }



    //tester
    public static void main(String args[]){
        Sequence711_713 a = new Sequence711_713(3);
        Sequence711_713 b = new Sequence711_713(3);
        Sequence711_713 c = new Sequence711_713(2);
        Sequence711_713 d = new Sequence711_713(3);
        Sequence711_713 e = new Sequence711_713(3);
        a.set(0,3);
        a.set(1,1);
        a.set(2,3);
        b.set(0,4);
        b.set(1,1);
        b.set(2,3);
        c.set(1,2);
        d.set(1,3);
        d.set(0,1);
        d.set(2,1);
        e.set(0,1);
        e.set(2,3);
        e.set(1,1);

        //Check whether two sequences have same values in the same order
        System.out.println("Same Values Same Order:");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        //Same values in same order, ignoring duplicates
        System.out.println("Same Values:");
        System.out.println(a.sameValues(b));
        System.out.println(a.sameValues(c));
        System.out.println(a.sameValues(d));

        System.out.println("Permutation:");
        System.out.println(a.isPermutationOf(b));
        System.out.println(a.isPermutationOf(c));
        System.out.println(a.isPermutationOf(d));
        System.out.println(d.isPermutationOf(e));
    }
}
