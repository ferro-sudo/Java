package Repl;

public class q023_FindVowels {

	public static void main(String[] args) {
		String word = "biblethump kappa";
		for (int i = 0; i < word.length(); i++) {
			if (word.substring(i, i + 1).equalsIgnoreCase("a") 
					|| word.substring(i, i + 1).equalsIgnoreCase("e")
					|| word.substring(i, i + 1).equalsIgnoreCase("o") 
					|| word.substring(i, i + 1).equalsIgnoreCase("u")
					|| word.substring(i, i + 1).equalsIgnoreCase("i")) {
				System.out.print(word.substring(i, i + 1));
			}
		}

	}

}
