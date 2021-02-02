package assignments.assignment_9;

public class question11_Sender {

	public static void main(String[] args) {


		String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		String sender;
		String phoneNumber;
		String messageBody;
		
		sender = message.substring(message.indexOf("<")+1, message.lastIndexOf(">"));
		System.out.println("Sender:"+sender);
		
		phoneNumber = message.substring(message.indexOf("[")+1, message.lastIndexOf("]"));
		System.out.println("Phone Number:"+phoneNumber);
		
		messageBody = message.substring(message.indexOf("{")+1, message.lastIndexOf("}"));
		System.out.println("Message body:"+messageBody);

	}

}
