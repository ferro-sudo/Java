package day34_Constructors;

public class testCalculator {

	public static void main(String[] args) {
		
		Calculator cal =new Calculator(new Floor(12, 10),new Carpet(8));
		System.out.println(cal.getTotalCost());

	}

}
