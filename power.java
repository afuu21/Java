import java.util.Scanner;
        public class power {
                public int sq(int a) {
                return a*a;
                }
                public int cu(int a) {
                return a*a*a;
                }
                public static void main(String args[]) {
                       int n;
                       Scanner sc = new Scanner(System.in);
                       power p = new power();
                       System.out.println("Enter a number to calculate square and cube\n");
                       n = sc.nextInt();
                       
                       System.out.println(p.sq(n));
                       
                       System.out.println(p.cu(n));
                }
                
        }
