package day33_Constructors;

public class Mouse {
	
	int numTeeth;
	int numWiskers;
	int weight;
	
	
	public Mouse(int weight) {		
		this.weight = weight;
	}


	public Mouse(int numTeeth, int numWiskers) {
		this.numTeeth = numTeeth;
		this.numWiskers = numWiskers;
	}


	public Mouse(int numTeeth, int numWiskers, int weight) {	
		this.numTeeth = numTeeth;
		this.numWiskers = numWiskers;
		this.weight = weight;
	}
	
	
	
	

}
