package day15_Method_Part3;

public class asignmentFibonacci {

	public static void main(String[] args) {

		int upper=15;
		int num1=0;
		int num2=1;
		int sum=0;
		for(int i=0;i<=upper;i++) {
			sum=num1+num2;
			System.out.print(num1+" ");
			num1=num2;
			num2=sum;
			
		}

	}

}
