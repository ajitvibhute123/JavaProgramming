
public class UC2 {

	public static void main(String[] args) {
		int fulltime=1;
		int rateperhr=20;
		int emphrs=0;
		int empwage=0;
		double check = Math.floor(Math.random()*10)%2;
		if (check == fulltime)
			emphrs = 8;
		else
			emphrs = 0;
		empwage = emphrs * rateperhr;
		System.out.println("EMPLOYEE WAGE=" +empwage);
	}
		
}
