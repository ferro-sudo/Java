package day10_controlFlowStatement;

public class task53 {

	public static void main(String[] args) {
		
		int i=0;
		int even=0;
		int odd=0;
		while(i<100) {
			if(i%2==0) {
			even+= i;
			
			}else {
				odd+=i;
			}
			i++;
		}
		System.out.println(even+" "+odd);

	}

}
