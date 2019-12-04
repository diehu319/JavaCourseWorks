//Testing R3.18

public class R318 // CarTester
{
  public static void main(String[] args)
  {
    Car myHybrid = new Car();
    System.out.print("Actual: ");
    myHybrid.getGasInTank();
    System.out.println(" Expected: 0" );

    myHybrid.addGas(20); // Tank 20 gallons
    System.out.print("Actual: ");
    myHybrid.getGasInTank();
    System.out.println(" Expected: 20" );

    myHybrid.drive(100); // Drive 100 miles, used 2 gallons
    System.out.print("Actual: ");
    myHybrid.getGasInTank();
    System.out.println(" Expected: 18" );

    myHybrid.addGas(30);
    System.out.print("Actual: ");
    myHybrid.getGasInTank();
    System.out.println(" Expected: 48" );

    myHybrid.drive(50); // used 1 gallons
    System.out.print("Actual: ");
    myHybrid.getGasInTank();
    System.out.println(" Expected: 47" );
  }
}