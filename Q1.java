//Q1) WAP for implementing all the operators. (choose 3) 

public class Main
{
  public static void main (String[]args)
  {
    int a = 1, b = 2;

    System.out.println("Relational Operator");
      System.out.println (a > b);
      System.out.println (a < b);
      System.out.println (a>=b);
      System.out.println (a<=b);
      System.out.println (a==b);
      System.out.println (a!=b);

    System.out.println("\nBitwise Operator");
    System.out.println (a&b);
    System.out.println (a|b);
    System.out.println (a^b);
    
    System.out.println("\nShift Operator");
    System.out.println (a<<b);
    System.out.println (a>>b);

  }
}