package day10_controlFlowStatement;

public class task46_Multiplication7 {

	public static void main(String[] args) {

		System.out.println("Multiplication table for 7");
		System.out.println("-------------------------------");
		int multiplier=7;
		int result=0;
		for(int i=1;i<=10;i++) {
			result=i*multiplier;
			System.out.println(multiplier+"*"+i+"="+result);
		}
	}

}
