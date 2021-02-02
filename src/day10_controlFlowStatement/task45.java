package day10_controlFlowStatement;

public class task45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=30;
		int numTimes=5;
		for(int i=0;i<numTimes;i++) {
			if(num1==num2) {
				System.out.println("Numbers are equal.");
			}else if(num1>num2) {
				System.out.println(num1+" is bigger");
			}else {
				System.out.println(num2+" is bigger");
			}
		}

	}

}
