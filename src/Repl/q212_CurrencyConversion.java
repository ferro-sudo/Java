package Repl;

public class q212_CurrencyConversion {

	public static double convertC(String[][] money, String[][] convertionRate) {
		double dolars=0;
		dolars = Double.parseDouble(money[0][1])*Double.parseDouble(convertionRate[0][1])
				+Double.parseDouble(money[1][1])*Double.parseDouble(convertionRate[1][1]);
		return dolars;

	}

	public static void main(String[] args) {

		String[][] test_money = { { "mark", "5" }, { "shekel", "30.5" }, };

		String[][] test_convert = { { "mark", "1" }, { "shekel", "0.5" }, };

		double res = q212_CurrencyConversion.convertC(test_money, test_convert);
		System.out.print(res);

	}

}
