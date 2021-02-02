package day19_StringClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task_81 {

	public static void main(String[] args) {
		
		  System.out.println(timeStamp());		

	}

	public static String timeStamp() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
		String date1 = dtf.format(now);
		String date=date1.replace("/", "").replace(" ",	"").replace(":", "");
		return date;
		
	}

}
