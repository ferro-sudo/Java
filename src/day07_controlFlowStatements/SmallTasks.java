package day07_controlFlowStatements;

public class SmallTasks {

	public static void main(String[] args) {
		int x, y= 20;
		if (y==20) {
			
			x=5;
			System.out.println(x);
		}
System.out.println("**************************************");

		double payrate = 1000;
		int hours = 48;
		if (hours>40) {
			System.out.println("Your payrate is = " +payrate*1.5);
		}
System.out.println("**************************************");	

		boolean max=false;
		double fees=20;
		
		if (max==true) {
		fees=50;
		}
		
		System.out.println("fee is " + fees);
System.out.println("**************************************");

		int a=100;
		int b=50;
		int c=100;
		if(b == 50 || c >= 100) {
			a=20;
		}
		System.out.println("a is:"+a +"  b is:"+b + "  c is:"+c );
System.out.println("**************************************");
		
		int temp=70;
		if(temp>=70 & temp<80) {
			System.out.println("Ideal Temp");
		}
		else{

		System.out.println("Unconfortable Zone");
		}



	}

}
