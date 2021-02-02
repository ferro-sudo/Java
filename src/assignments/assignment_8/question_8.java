package assignments.assignment_8;

public class question_8 {

	public static void main(String[] args) {

		fib(2);

	}

	public static void fib(int upper) {
		
		int num1=0;
		int num2=1;
		int sum=0;
		for(int i=1;i<upper;i++) {
			sum=num1+num2;			
			num1=num2;
			num2=sum;
			
		}System.out.print(num1);
		
	}

}
