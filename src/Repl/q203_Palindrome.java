package Repl;

public class q203_Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("Noon"));// ==> true

		isPalindrome("I am not palindrome");// ==> false

		isPalindrome("wooden");// ==> false

		isPalindrome("Nurses Run");// ==> true

	}

	public static boolean isPalindrome(String check) {

		check = check.replace(" ", "");

		String reverse = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			reverse += (check.toLowerCase().charAt(i));
		}
		if (check.toLowerCase().equals(reverse)) {
			return true;
		} else {
			return false;
		}

	}

}
