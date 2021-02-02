package assignments.assignment_8;

public class question_15 {

	public static void main(String[] args) {


		System.out.println(validateTask(true,2,1));

	}

	public static boolean validateTask(boolean isFull, int taskId, int currentId) {
		if(isFull&&(taskId==currentId+1)) {
		return true;
		}else {
			return false;
		}
	}

}
