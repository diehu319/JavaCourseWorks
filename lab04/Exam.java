//Estimate Score: 86
import java.math.BigDecimal;
public class Exam{
  public static void main(String[] args){
    //Q7 Correction
    System.out.println(4%7);
    System.out.println("Expected: 4");
    
    //Q10 Correction
    System.out.println(7%4);
    System.out.println("Expected: 3");
  }
  
  //Q21 Correction
  public int b = 5;
  public Boolean Q21(){
    return (++b > b);
    
  }
  
  //Q42 Correction
  //Dangling else is a if-else statement where there are no curly brackets after the first if statement, therefore, the 
  //else statement will goes with the last if statement instead of the first if.
  public Double GPA = 3.3;
  public Double Q42(){
    if (GPA < 4.0)
      if (GPA >3.4)
      System.out.println("GPA > 3.4");
    else
      System.out.println("GPA < 3.4");
    return GPA;
  }
  
  //Q49 Correction
  public int n = 0;
  private Boolean a;
  public Boolean Q49(){
    if (n < 0)
      a = true;
    else
      a = (n > 1);
    return a;
  }
  
  //Q50 Correction
  public int m = 0;
  public int Q501(){
    if (m == 0)
      m = m + 3;
    else
      m = 5;
    return m;
  }
  public int Q502(){
    if (m == 8)
      m = m + 3;
    if (m != 8)
      m = 5;
    return m;
  }
}