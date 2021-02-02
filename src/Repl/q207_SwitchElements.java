package Repl;

import java.util.Arrays;

public class q207_SwitchElements {

	public static void main(String[] args) {
		int[] arr2 = { 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(do_switch(arr2)));

	}

	public static int[] do_switch(int[] i) {
		int[] switchArr=new int[i.length];
		for(int j=0;j<switchArr.length;j++) {
			if(j!=0&&j!=i.length-1) {
			switchArr[j]=i[j];
			}else if(j==0) {
				switchArr[j]=i[i.length-1];
			}else if(j==i.length-1) {
				switchArr[j]=i[0];
			}
		}
		return switchArr;

	}

}
