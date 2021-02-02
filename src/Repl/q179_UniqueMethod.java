package Repl;

public class q179_UniqueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			int j;
			for (j = 0; j < i; j++)
				if (str.substring(i, i + 1).equals(str.substring(j, j + 1)))
					break;
			if (i == j)
				temp += str.charAt(i);
		}
		return temp;
	}

}
