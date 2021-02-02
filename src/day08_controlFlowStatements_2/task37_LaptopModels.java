package day08_controlFlowStatements_2;

public class task37_LaptopModels {

	public static void main(String[] args) {

		String laptopModel ="apple";
		
		switch(laptopModel) {
		case "apple":
			System.out.println("Apple-no virus");
			break;
		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("do not buy that one" );
			
		}

	}

}
