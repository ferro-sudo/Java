package day08_controlFlowStatements_2;

public class task39TrafficLights {

	public static void main(String[] args) {

		char trafficLights = 'R';
		
		switch (trafficLights) {
		case 'R': case 'r':
			System.out.println("Red");
			break;
		case 'O': case 'o':
			System.out.println("Orange");
			break;
		case 'G': case 'g':
			System.out.println("Green");
			break;
		default:
			System.out.println("Invalid color");
		}

	}

}
