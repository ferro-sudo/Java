package day14_method_Part2;

public class lab_1AllQuestions {

	public static void main(String[] args) {
		//stringTimes("hello", 5);
		love6(90, 5);
		//specialEleven(11);
		//deerPlay(90, false);
		//caughtSpeed(61, true);
		//cigarParty(70, true);

	}
	//Question-1
	public static void stringTimes(String str, int times) {
		String string="";
		for(int i=1;i<=times;i++) {
			string=string+str;
			
		}System.out.print(string);
	}
	//Question-2
	public static void love6(int num1, int num2) {
		
		if(num1==6||num2==6||num1+num2==6||num1-num2==6||num2-num1==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	//Question-3
	public static void specialEleven(int num) {
		if(num%11==0||num%11==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}		
	}
	//Question-4
	public static void deerPlay(int temp,boolean isSummer) {
		
		if(isSummer) {
			if(temp>60&&temp<100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>60&&temp<90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}	
		
	}
	//Question-5
	public static void caughtSpeed(int speed,boolean isBirthday) {
		if(isBirthday) {
			speed-=5;
		}
		if(speed>60&&speed<=80) {
			System.out.println(1);
		}else if(speed>80) {
			System.out.println(2);
		}else {
			System.out.println(0);
		}
		
	}
	//Question-6
	public static void cigarParty(int cigars,boolean isWeekend) {
		if(isWeekend) {
			if(cigars>=40&&cigars<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(cigars>=40&&cigars<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}
}
