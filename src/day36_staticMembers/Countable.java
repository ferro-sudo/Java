package day36_staticMembers;

public class Countable {
	
	static int instanceCount;  //instance vriable
	int instanceCount2;
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}

}
