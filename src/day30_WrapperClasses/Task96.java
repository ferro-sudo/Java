package day30_WrapperClasses;

public class Task96 {

	public static void main(String[] args) {
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		temperatureConverter(str1);
	}

	public static void temperatureConverter(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			}
		}

		double degreeF = Double.parseDouble(temp);
		double degreeC = (degreeF - 32) * 5 / 9;
		System.out.println(degreeF + " degree is equal to " + String.format("%.2f", degreeC) + " celcius");
	}

}
