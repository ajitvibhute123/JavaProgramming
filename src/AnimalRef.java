import java.util.Scanner;
public class AnimalRef {

	String color;
	int age;
	
	public static void main(String[] args) {
		
		AnimalRef buzo = new AnimalRef();
		buzo.color="black";
		buzo.age=14;
		
		System.out.println(buzo.color+" "+buzo.age);
	
		Product pr = new Product();
		pr.Multiplication();
	}

}
class Product{
	int a,b,sum;
	public void Multiplication() {
	
		System.out.println("Multplicatin of two digit");	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Digit");
		a=sc.nextInt();
		System.out.println("Enter the Second Digit");
		b=sc.nextInt();
	
		sum= a+b;
		System.out.println("Addition =" +sum);
	}
}





