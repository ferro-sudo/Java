package Repl;

public class q209_ExtractNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extractNum("aa!!%$#.10aa"));
	}

	public static String extractNum(String s) {
		String str="";		
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				str+=c;
			}
		}
		return str;
	}

}
