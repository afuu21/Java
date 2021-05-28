import java.util.Scanner;
public class add{
  public int done(int a, int b) {
    return a+b;
  }
  public static void main(String args[]) {
    int a, b;
    System.out.println("Enter the two numbers to be added: ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    add x = new add();
    int c = x.done();
    System.out.println(a + " " + b + " = " + c);
  }
}
