package day36_staticMembers;

public class StaticInit {
	
	static final int NUM_SECONDS_PER_HOURS;
	
	static {
		System.out.println("Static init");
		int numSecondperMinute=60;
		int numMinutePerHour=60;
		NUM_SECONDS_PER_HOURS=numMinutePerHour*numSecondperMinute;
	}
	
	private static int one;
	private static final int TWO;
	private static final int THREE;
	//private static final int FOUR;
	
	static {
		one=1;
		TWO=2;
		THREE=4;
		//TWO=4;
	}
	
}
