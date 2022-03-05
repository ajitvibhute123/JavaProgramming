import java.util.Scanner;
public class LeapYear1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n; 
		System.out.println("Enter the Year");
		n=sc.nextInt();
		if((n%400==0) || (n%4==0 && n%100 != 0))
		{
			System.out.println("It is Leap year");
		}
		else
		{
			System.out.println("It isnot Leap year");
		}	
	}

}
