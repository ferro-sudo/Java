package day13_methods_Part1;

public class task56_KmMiles {

	public static void main(String[] args) {

		System.out.println(convertKM(80));
		sumNum(5, 6, 7);
		greaterNum(30, 30);
		

	}

	public static String convertKM(double miles) {
		return String.format("%.2f", miles*1.60934);
		
	}
	
	public static void sumNum(int a, int b,int c) {
		int sum= a+b+c;
		System.out.println(sum);
		
	}
	
	public static void greaterNum(int a,int b) {
		
		if(a>b) {
			System.out.println(a+" is greater.");
		}else if(b>a) {
			System.out.println(b+" is greater");
		}else {
			System.out.println("Numbers are equal.");
		}
		
	}

}
