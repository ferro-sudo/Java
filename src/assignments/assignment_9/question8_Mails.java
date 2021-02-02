package assignments.assignment_9;

public class question8_Mails {

	public static void main(String[] args) {


		String mail="subject: important project, Alejandro we refer to you this ....";
		
		if(mail.toLowerCase().contains("alejandro")) {
			System.out.println("read this mail");
		}else {
			System.out.println("don't read");
		}

	}

}
