package day08_controlFlowStatements_2;

public class case36_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=5;
		String operator="*";
		int result=0;
		
		switch(operator) {
		
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		default:
			System.out.println("Invalid Operator");
		
		}
		
		System.out.println("Result is " + result);

	

	}

}
