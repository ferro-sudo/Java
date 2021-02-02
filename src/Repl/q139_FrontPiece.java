package Repl;

import java.util.Arrays;

public class q139_FrontPiece {

	public static void main(String[] args) {
		int[] num = {1};
		
		int[] frontTwo=new int[2];
		if(num.length<2)
			System.out.println(Arrays.toString(num));
		else {
			for(int i=0;i<frontTwo.length;i++) {
				frontTwo[i]=num[i];
			}
			System.out.println(Arrays.toString(frontTwo));
		}
			
		

	}

}
