package day14_method_Part2;

public class ValueReturn {

	public static void main(String[] args) {
		System.out.println(distance(60, 3));
		
		if(distance(120, 3)>500) {
			
		}

	}
	
	public static int distance(int speed, int time ) {
		return speed*time;
	}

}
