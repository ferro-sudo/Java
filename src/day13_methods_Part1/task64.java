package day13_methods_Part1;

public class task64 {

	public static void main(String[] args) {
		printPatern(3);
		printPatern(4);
		printPatern(5);
		printPatern(6);

	}
	
	public static void printPatern(int a){
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
