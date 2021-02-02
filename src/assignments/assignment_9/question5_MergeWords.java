package assignments.assignment_9;

public class question5_MergeWords {

	public static void main(String[] args) {


		String word1 ="ali";
		String word2 ="gel";
		String word1Merge ="";
		String word2Merge ="";
		String merge="";
		
		if(word1.length()==3&&word2.length()==3) {
			for(int i=0;i<3;i++) {
			merge+=word1Merge.concat(word1.substring(i, i+1));
			merge+=word2Merge.concat(word2.substring(i, i+1));				
			}
			System.out.println(merge);
		}else {
			System.out.println("cannot merge");
		}
		
		

	}

}
