package day13_methods_Part1;

public class task65 {

	public static void main(String[] args) {


		calculateGrade(50, 50, 50);

	}
	
	public static void calculateGrade(int a,int b,int c) {
		int grade = (a+b+c)/3;
		
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80&&grade<90) {
			System.out.println("B");
		}else if(grade>=70&&grade<80) {
			System.out.println("C");
		}else if(grade>=60&&grade<70) {
			System.out.println("D");
		}else if(grade<60) {
			System.out.println("F");
		}
		
	}

}
