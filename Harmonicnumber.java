import java.util.Scanner;

public class Harmonicnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, i = 1;

		System.out.println("Enter The Harmonic Number");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) 
		{
			System.out.print("1/" + i + "+");
		}
	}
}
