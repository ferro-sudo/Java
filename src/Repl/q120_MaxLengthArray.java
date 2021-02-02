package Repl;

public class q120_MaxLengthArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
		
		//write your code below
		String max =words[0];
		for(String s:words) {
			if(max.length()<s.length()) {
				max=s;
			}
		}
		System.out.println(max);
	}

}
