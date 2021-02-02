package day05_unery_assignment_relation;

public class mixedInteger {

	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 10;
		float f1 =15.5f;
		double d1 = 20.5;
		
		int res1 = i1+i2;
		float res2 = i1+ f1;
		double res3 = i2+d1;
		
	    short s1= 121;
		byte b1 = 7;
		
		short thirdNum = (short) (s1+b1);
		System.out.println(thirdNum);

	}

}
