package assignments.assignment_8;

public class question_16 {

	public static void main(String[] args) {


		System.out.println(simpleRoomBook(true,2,2,2018));

	}

	public static boolean simpleRoomBook(boolean isVacant, int month, int day, final int YEAR) {
		
		if(YEAR!=2018||!isVacant) {
			return false;
		}else{
			if(month==7&&(day<=8&&day>=1)) {
				return false;
			}else {
				return true;
			}
		}
		
	}

}
