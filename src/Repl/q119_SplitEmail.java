package Repl;

public class q119_SplitEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email ="my@fancy@email.com";
		
		String[] arrMail=email.split("@");
		
		if(arrMail.length==2) {
			System.out.println("Email id: "+arrMail[0]);
			System.out.println("Email domain: "+arrMail[1]);
		}else
			System.out.println("invalid email");
	}

}
