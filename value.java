import java.util.Scanner;

public class value {
	
	public void display(float a, String b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}

	public static void main(String[] args) {
		
		float x;
		String y;
		int z;
		
		Scanner sc = new Scanner(System.in);
		value b = new value();
		
		x = sc.nextFloat();
		y = sc.next();
		z = sc.nextInt();
		
		b.display(x, y, z);

	}

}
