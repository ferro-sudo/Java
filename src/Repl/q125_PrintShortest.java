package Repl;

public class q125_PrintShortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
		
		String min =str[0];
		for(String s:str) {
			if(min.length()>s.length()) {
				min=s;
			}
		}
		System.out.println(min);
	}

}
