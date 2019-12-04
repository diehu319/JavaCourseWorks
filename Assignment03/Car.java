//E3.12

public class Car
{
  public int value;

  public void addGas(int amount){
    value += amount;
  }
  
  public void drive(int a){

    value -= a/50;
  }

  public void getGasInTank(){
    System.out.println(value);
  }
}