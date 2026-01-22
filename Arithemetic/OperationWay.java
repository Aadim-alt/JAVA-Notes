//So you have heard of bodmas rule in math right yeah we also have same concept here 

public class OperationWay{
  public static void main(String[] args){
    //We Follow [P-E-M-D-A-S] rule here
    double calculate = 2 + 3 * (5-3)/2.0;
    //Hre first (5-3) is done that is P-E-M-D-A-S parenthesis
    //After that E-M-D-A-S exponents but no exponents
    //then M-D-A-S Multiplication that is Multiplication 2*3 that is 6;
    // Then D-A-S that is Division that is 6/2 that is 3
    // Then A-S Addition That is 2 + 3 is 5
    // then S but no Subtraction so answer is 5
    System.out.println(calculate);
  }
}
