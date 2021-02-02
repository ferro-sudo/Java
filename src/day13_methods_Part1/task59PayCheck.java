package day13_methods_Part1;

public class task59PayCheck {

	public static void main(String[] args) {
		
		payCheck(5, 12);
		calculator(64326, 5625, "-");
		
		

	}
	
	public static void payCheck(int hours,int pay) {
		
		System.out.println(hours*pay);
		
	}
	
	public static void calculator(int num1,int num2, String operator) {
		int result=0;
		if(operator.equals("+")) {
			result=num1+num2;			
		}else if(operator.equals("-")) {
			result=num1-num2;
		}else if(operator.equals("*")) {
			result=num1*num2;
		}else if(operator.equals("/")) {
			result=num1/num2;
		}
		System.out.println(result);
		
	}

}
