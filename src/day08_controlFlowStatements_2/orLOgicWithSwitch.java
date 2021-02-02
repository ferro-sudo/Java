package day08_controlFlowStatements_2;

public class orLOgicWithSwitch {

	public static void main(String[] args) {
		
		char grade = 'D';
		
			
		switch(grade) {
		case 'A':case 'B':case 'C':
			System.out.println("pass");
			break;
		case 'D':case 'E':
			System.out.println("fail");
			break;
		
			
		}
		
		
	}

}
