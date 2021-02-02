package assignments.assignment_9;

public class question10_InformationFromEmail {

	public static void main(String[] args) {

		String email = "craig_federighi@apple.com";
		String name = email.substring(0, email.indexOf("_"));
		name = name.replace(name.charAt(0), name.toUpperCase().charAt(0));
		System.out.println("First Name: " + name);

		String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
		lastName = lastName.replace(lastName.charAt(0), lastName.toUpperCase().charAt(0));
		System.out.println("Last name: " + lastName);

		String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
		System.out.println("Domain: " + domain);

		String topDomain = email.substring(email.lastIndexOf(".") + 1);
		System.out.println("Top-Level Domain: " + topDomain);

	}

}
