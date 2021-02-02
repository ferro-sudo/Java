package day15_Method_Part3;

public class task71 {

	public static void main(String[] args) {


		//double x=calcFeetAndInchesToCentimeters(0,12);
		double y=calcFeetAndInchesToCentimeters(200,10);
		System.out.println(y);
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		// TODO Auto-generated method stub
		if(inches<0) {
			return -1;
		}

		double feet=(int)(inches/12);
		inches=inches%12;
		
		return calcFeetAndInchesToCentimeters(feet, inches);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		// TODO Auto-generated method stub
		double centimeters=0;
		if(feet<0||inches<0||inches>12) {
			return -1;
		}else {
			centimeters=feet*12*2.54;
			centimeters+=inches*2.54;
			return centimeters;
		}
	}

}
