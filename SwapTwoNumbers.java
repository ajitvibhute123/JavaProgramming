import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("Enter the First number a");
		a = sc.nextInt();

		System.out.println("Enter the First number b");
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a=" + a + "\n b=" + b);
	}

}
