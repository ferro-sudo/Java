package day23_Strings;

public class q15 {

	public static void main(String[] args) {


		 String str = "xxbadxx";
		 
		 boolean flag =true;
		 
		 for(int i=0;i<2;i++) {
			 if(str.substring(i, i+3).equals("bad")) {
				 flag= true;
				 break;
			 }else {
				 flag= false;
			 }
				 
		 }
		 System.out.println(flag);
	}

}
