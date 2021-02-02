package Repl;

public class q187_LameDB {

	public static String lameDb(String db, String op, String id, String data) {
		String[] str = db.split("#");
		if (str.length < 4) {
			switch (op) {
			case "add":
				return db + "#" + id + data;
			case "edit":
				String newDb = "";
				str[Integer.parseInt(id) - 1] = id + data;
				for (int i = 0; i < str.length; i++) {
					if (i != str.length - 1)
						newDb += str[i] + "#";
					else
						newDb += str[i];
				}
				return newDb;
			case "delete":
				String newDb1 = "";
				str[Integer.parseInt(id) - 1] = data;
				for (int i = 0; i < str.length; i++) {
					if (i != str.length - 1)
						newDb1 += str[i] + "#";
					else
						newDb1 += str[i];
				}
				return newDb1;
			default:
				return db;
			}
		}
		return db;

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
