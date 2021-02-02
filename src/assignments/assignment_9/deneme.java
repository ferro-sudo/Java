package assignments.assignment_9;

import java.util.Random;

public class deneme {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		String[] words = new String[size];
//		for (int i = 0; i < size; i++) {
//			words[i] = scan.next();
//		}
		String[]words= {"java", "code","java", "python", "java", "java","java"};
		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {

		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0, counter = 0; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {

					counter++;
					System.out.println(counter);
					if (counter % 2==0) {
						
						words[i] = words[i].replace(words[i], "");
						words[j] = words[j].replace(words[j], "");
						
						

						break;
					}

				}

			}

		}
		for (String s : words) {
			if (!s.equals("")) {
				System.out.println(s);
			}
		}
	}
}
