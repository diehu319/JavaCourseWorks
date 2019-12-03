//R3.17
public class Counter {
    private int value;

    public void getValue(){
        System.out.println(value);
    }

    public void click(){
        value = value + 1;
    }

    public void reset(){
        value = 0;
        System.out.println(value);
    }

    public static void main(String[] args)
    {
        Counter x = new Counter();
        x.value = 50;
        x.getValue(); // output: 50
        x.reset();
        x.reset();
        x.getValue(); // output: 0
        x.click();
        x.getValue(); // output: 1
        x.click();
        x.getValue(); // output: 2
        x.click();
        x.getValue(); // output: 3
    }
}
