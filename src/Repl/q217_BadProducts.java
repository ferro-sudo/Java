package Repl;

public class q217_BadProducts {

	public static void main(String[] args) {
		System.out.println(badP(new int[]  {1,1,1,1,0},2));

	}

	public static boolean badP(int[] products, int limit) {
		int counter=0;
		for(int i=0;i<products.length;i++) {
			if(products[i]==0)
				counter++;
		}
		if(counter>=limit)
			return false;
		return true;
	}

}
