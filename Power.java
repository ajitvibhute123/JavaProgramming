import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x , y , product = 1;
		System.out.println("Any Power");
		System.out.println("Enter the Base");
		x = sc.nextInt();
		System.out.println("Enter the Power");
		y = sc.nextInt();
		for(;y>0;y--)
		{
			product=product*x;
			
		}
		 	
		System.out.println("x^y =" +product);

	}

}
