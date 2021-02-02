package assignments.assignment_3;

public class question5 {

	public static void main(String[] args) {
		
		int inputSeconds=3695;
		int hours, minutes, seconds;
		
		seconds= inputSeconds%60;
		hours= inputSeconds/60;
		minutes= hours%60;
		hours=hours/60;
		 
		 
		 System.out.println(hours+" hours "+ minutes+ " minutes and "+ seconds + " seconds.");
		

	}

}
