import java.util.Scanner;
public class VowelOrConsonent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char ch ='z';
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		
			System.out.println("It is vowel ="  +ch);
			break;
		
		default:
			System.out.println("It is Consonent ="  +ch);
		}

	}

}
