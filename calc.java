import java.util.Scanner;
  public class calc {
    public void add(int x, int y) {
    System.out.println(x+y);
    }
    public void sub(int x, int y) {
    System.out.println(x-y);
    }
    public void mul(int x, int y) {
    System.out.println(x*y);
    }
    public void divide(int x, int y) {
    System.out.println(x/y);
    }
    public static void main(String args[]) {
    int x, int y;
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    calc c = new calc();
    calc.add(x,y);
    calc.sub(x,y);
    calc.mul(x,y);
    calc.divide(x,y);
    }
    
  }
