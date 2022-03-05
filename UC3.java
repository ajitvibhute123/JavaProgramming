
public class UC3 {

	public static void main(String[] args) {
	int fulltime = 1;
	int parttime = 2;
	int rateprhr = 20;
	int emphrs = 0;
	int empwage = 0;
	double check = Math.floor(Math.random()*10)%3;
		if (check == fulltime)
	     emphrs = 8;
		else if (check == parttime)
		 emphrs = 4;
		else
		 emphrs = 0;
	empwage = emphrs*rateprhr;
	System.out.println("Emp Wage=" +empwage);
	}
	

}
