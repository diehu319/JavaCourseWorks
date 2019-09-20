//Testing R3.17

public class R317
{
  public static void main(String[] args)
  {
    Counter x = new Counter(50);
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