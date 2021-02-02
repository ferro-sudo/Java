package day19_StringClass;

public class task77 {

	public static void main(String[] args) {


		String emoji=";O";
		
		if(emoji.length()!=2) {
			System.out.println("invalid emoji");
		}else {
			if(emoji.charAt(0)==':') {
				switch(emoji.charAt(1)) {
				case ')':
					System.out.println("Smile");
					break;
				case '(':
					System.out.println("Sad");
					break;
				case '/':
					System.out.println("Upset");
					break;
				case 'p':
					System.out.println("Playful");
					break;
				default:
					System.out.println("invalid emoji");
					
				}
					
			}else if(emoji.charAt(0)==';') {
				switch(emoji.charAt(1)) {
				case ')':
					System.out.println("Wink");
					break;
				case 'O':
					System.out.println("Sad");
					break;				
				default:
					System.out.println("invalid emoji");
				}
			
			}
		}

	}

}
