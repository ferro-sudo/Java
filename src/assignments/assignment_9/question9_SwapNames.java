package assignments.assignment_9;

public class question9_SwapNames {

	public static void main(String[] args) {


		String email= "mike_tyson@gmail.com";
		String name="";
		String lastName="";
		String output="";
		
		name=email.substring(0, email.indexOf("_"));
		lastName=email.substring(email.indexOf("_")+1, email.indexOf("@"));
		output=email.replace(lastName, name);
		output=output.replaceFirst(name, lastName);
		System.out.println(output);
		

	}

}
