package Repl;

public class q140_PrintLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "hello", "why", "by", "apple", "note" };
		for (int i = 0; i < words.length; i++) {
			if (i != 0 && i != words.length - 1) {
				System.out.print("" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + ", ");
			} else if (i == 0) {
				System.out.print("[" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + ", ");
			} else {
				System.out.print("" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + "]");
			}
		}
	}

}
