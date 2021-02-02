package assignments.assignment_3;

public class question6 {

	public static void main(String[] args) {
		
		int mgCafein = 500;
		int lethalOverDose = 10000;
		
		int dosesToKill= lethalOverDose/mgCafein;
		
		System.out.println("Number of miligrams in drink: "+mgCafein);
		System.out.println("It would take about "+dosesToKill+" drinks for a lethal overdose");

		

	}

}
