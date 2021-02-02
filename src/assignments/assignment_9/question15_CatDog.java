package assignments.assignment_9;

public class question15_CatDog {

	public static void main(String[] args) {

		String word = "catdogcatcatljhsdogfkdhdogslfkjcatklfjdogdoghgldsjcat;skdfjgdogdkcatlfasjadg;jkgcat";

		int catCounter = 0;
		int dogCounter = 0;

		for (int i = 1; i < word.length() - 2; i++) {
			if (word.subSequence(i, i + 3).equals("cat")) {
				
				catCounter++;
			}
			if (word.subSequence(i, i + 3).equals("dog")) {
				
				dogCounter++;
			}

		}
		if (catCounter == dogCounter) {
			System.out.println(true);
		} else {
			System.out.println(false);

		}

	}

}
