import java.util.Scanner;
public class OuotientAndRemainder {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int dividned,divisor,remainder,quotient;
		System.out.println("Enter the nu which is dividned");
		dividned = sc.nextInt();
		
		System.out.println("Enter the nu  which is Divisor");
		divisor = sc.nextInt();
		
		quotient = dividned / divisor;
		remainder = dividned % divisor;
		
		System.out.println("quotient=" +quotient + "\nremainder=" +remainder);
		
	}

}
