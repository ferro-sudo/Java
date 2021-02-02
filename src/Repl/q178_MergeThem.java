package Repl;

public class q178_MergeThem {
	public static void main(String[] args) {
		System.out.println(mergeStrings("java", "selenium"));
	}

	public static String mergeStrings(String one, String two) {

		String merge = "";

		if (one.length() >= two.length()) {
			for (int i = 0; i < two.length(); i++) {
				merge = merge.concat(one.substring(i, i + 1)).concat(two.substring(i, i + 1));
			}

			merge += one.substring(two.length());

		} else if (one.length() <= two.length()) {
			for (int i = 0; i < one.length(); i++) {
				merge = merge.concat(one.substring(i, i + 1)).concat(two.substring(i, i + 1));
			}

			merge += two.substring(one.length());

		}
		return merge;
	}

}
