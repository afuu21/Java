import java.util.Scanner;
  public class large {
    public comp(int a, int b) {
    if(a>b)
      return a;
    else
      return b;
    }
    
    public static void main(String args[]) {
      int a, b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers");
      a = sc.nextInt();
      b = sc.nextInt();
      large l = new large();
      Systeme.out.println("The larger of two numbers is: " + l.comp(a,b));
      
    }
  
  }
