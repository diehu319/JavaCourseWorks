//Testing R3.18

public class R318 // CarTester
{
  public static void main(String[] args)
  {
    Car myHybrid = new Car(50); // 50 miles per gallon
    myHybrid.addGas(20); // Tank 20 gallons
    myHybrid.drive(100); // Drive 100 miles, used 2 gallons
    myHybrid.addGas(30);
    myHybrid.drive(50); // used 1 gallons
    double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
    System.out.println(gasLeft);
    System.out.println("Expected 77");
  }
}