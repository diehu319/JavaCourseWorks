//E3.12

public class Car
{
  private int value;

  public void addGas(int amount){
    value += amount;
  }
  
  public void drive(int a){
    value -= a/50;
  }
  public int getGasInTank(){
    return value;
  }
}