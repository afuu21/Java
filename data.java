import java.util.Scanner;
  public class data {
    public void display(String name, int age, String profession) {
    System.out.println("Name: " + name + "\tAge: " + age + "\tProfession: " + profession);
    }
    
    public static void main(String args[]) {
      String x, y;
      int z;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name:");
      x = sc.next();
      System.out.println("Enter the age:");
      z = sc.nextInt();
      System.out.println("Enter the profession:");
      y = sc.next();
      data d = new data();
      d.display();
    }
  
  }
