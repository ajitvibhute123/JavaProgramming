
public class UC5 {

	public static void main(String[] args) {

		int fulltime = 1;
		int parttime = 2;
		int rateprhr = 20;
		final int Workingdays = 2;
		int emphrs = 0;
		int empwage = 0;
		int totalwage = 0;
		for (int day = 0; day < Workingdays; day++) {

			int empcheck = (int) (Math.floor(Math.random() * 10) % 3);

			switch (empcheck) {
			case 1:
				emphrs = 8;
				break;
			case 2:
				emphrs = 4;
				break;
			default:
				emphrs = 0;
			}
			empwage = emphrs * rateprhr;
			totalwage += empwage;
			System.out.println("Emp wage=" + totalwage);

		}

	}
}
