import java.util.Scanner;

public class Animal {
      
	public void run()
	{
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		
		System.out.println("This is Tiger");
		
		Animal Motya=new Animal();
		Motya.run();
		Animal Tiger=new Animal();
		Tiger.eat();
		Birds Peacock=new Birds();
		Peacock.fly();
		Add Ajit=new Add();
		Ajit.addition();
	}
	public void eat()
	{
	System.out.println("I am eating");
	}
	
}
 class Birds
 {
	void fly() 
	{
		System.out.println("I am Flying");
	}
	
}	 	 
 class Add
 {
	 void addition()
	 {
		 int a,b,sum;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the First Number");
	     a=sc.nextInt();
	     System.out.println("Enter the Second Number");
	     b=sc.nextInt();
	     sum = a+b;
         System.out.println("Addition of two number is =" +sum);
	 }
 }