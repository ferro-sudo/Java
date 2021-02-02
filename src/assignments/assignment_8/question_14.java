package assignments.assignment_8;

public class question_14 {

	public static void main(String[] args) {


		System.out.println(threeLocks(true, true, false));

	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    if(a&&b||c){
	      return true;
	    }else{
	      return false;
	    }
	    
	    
	  }

}
