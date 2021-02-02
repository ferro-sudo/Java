package Repl;

public class q180_Cover {
	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me")); // java [me]thods
		System.out.println(coverString("Certified Wooden Spoon", "o")); // ==> "Certified W[o][o]den Sp[o][o]n"

		System.out.println(coverString("hello hello", "ello"));// ==>"h[ello] h[ello]"

		System.out.println(coverString("apples", "pears"));// ==> "[apples]"
	}

	public static String coverString(String main, String coverME) {
		if (main.contains(coverME)) {
			return main.replace(coverME, "[" + coverME + "]");
		} else {
			return "[" + main + "]";
		}
	}

}
