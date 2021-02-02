package Repl;

import java.util.Scanner;

public class q152_ArrayMethod {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    //System.out.println(arr[3]);
	    
	    plus_minus(arr);
	    

	}

	public static void plus_minus(int[] arr) {
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<0) {
				negative+=1;
			}else if(arr[i]>0) {
				positive+=1;
			}else if(arr[i]==0) {
				zero+=1;
			}
		}
		System.out.println("positives:"+positive+", negatives:"+negative+", zeros:"+zero);
		
		
	}

}
