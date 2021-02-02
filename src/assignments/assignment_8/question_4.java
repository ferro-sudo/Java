package assignments.assignment_8;

public class question_4 {

	public static void main(String[] args) {
		printHollowRect();

	}
	
	public static void printHollowRect()
	  {
	   for(int i=1;i<=5;i++) {
		   if(i==1||i==5) {		   
		   for(int j=1;j<=5;j++) {			   
				   System.out.print("*"); 
			   }System.out.println();			   
		   }else {
			   System.out.println("*   *");
		   }			   
	   	}
	   }

}
