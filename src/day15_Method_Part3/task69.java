package day15_Method_Part3;

public class task69 {

	public static void main(String[] args) {
		System.out.println(isPrime(1));

	}
	
	public static boolean isPrime(int num) {
		boolean flag= true;
		if(num==0||num==1) {
			flag=false;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}else {
					flag=true;
				}
			}
		}
		return flag;
	}

}
