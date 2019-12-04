//E3.12
public class CarTester {
    public static void main(String[] args){
        Car myHybrid = new Car();
        myHybrid.addGas(20);
        myHybrid.drive(100);
        myHybrid.getGasInTank();
        System.out.println("Expected: 18");
    }
}
