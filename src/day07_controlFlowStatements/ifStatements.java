package day07_controlFlowStatements;

import java.util.Locale;

public class ifStatements {

	public static void main(String[] args) {
int score = 70;
		
		if(score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
		
		}
		
		System.out.println("***********************");
		
		int sales,bonus;
		double commisionRate,salary;
		
		sales=5000;
		salary=10000;
		
		if(sales>=5000) {
			bonus=500;
			commisionRate=1.12;
			
			salary=salary*commisionRate+bonus;
		}
		
		System.out.println("Salary = " + String.format(Locale.US,"%.2f", salary));


	}

}
