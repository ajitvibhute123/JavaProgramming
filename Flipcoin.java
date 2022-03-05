import java.util.Scanner;
import java.util.Random;

public class Flipcoin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand = new Random();
		int i=0,coin, flip,hcount=0,tcount=0;
		System.out.println("How Many wants to flip the coin");
		flip = sc.nextInt();
		 for(i=0;i<flip;i++)
		 {
			 coin = rand.nextInt(2);
			 if (coin == 0)
			 {
				 System.out.println("Heads");
				 hcount++;
			 }
			 else
			 {
				 System.out.println("Talis");
				 tcount++;
			 }
		 
	}
		 System.out.println("Percentage of Heads=" +hcount * 1.0/flip);
		 System.out.println("Percentage of Tails=" +tcount * 1.0/flip);
	}
}