import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Enter the First number");
		a = sc.nextInt();
		System.out.println("Enter the Second number");
		b = sc.nextInt();
		System.out.println("Enter the Third number");
		c = sc.nextInt();

		if (a > b && a > c)
			System.out.println("It is bigger rather than two numbers =" + a);

		else if (b > c && b > a)
			System.out.println("It is bigger rather than two numbers =" + b);
		else
			System.out.println("It is bigger rather than two numbers =" + c);
	}

}
