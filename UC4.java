
public class UC4 {
	public static final int fulltime = 1;
	public static final int parttime = 2;
	public static final int rateprhr = 20;

	public static void main(String[] args) {

		int emphrs = 0;
		int empwage = 0;
		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case fulltime:
			emphrs = 8;
			break;
		case parttime:
			emphrs = 4;
			break;
		default:
			emphrs = 0;
		}
		empwage = emphrs * rateprhr;
		System.out.println("Emp wage=" + empwage);
	}

}
