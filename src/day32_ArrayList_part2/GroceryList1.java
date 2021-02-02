package day32_ArrayList_part2;

import java.util.ArrayList;

public class GroceryList1 {
	
	ArrayList<String> groceryList=new ArrayList<>();

	public void printGroceryList() {
		System.out.println(groceryList);
		
	}

	public void addGroceryItem(String item) {
		groceryList.add(item);		
	}

	public void modifyGroceryItem(int i, String newItem) {
		groceryList.set(i, newItem);		
	}

	public void removeGroceryItem(int i) {
		groceryList.remove(i);		
	}

	public String findItem(String searchItem) {
		int index = groceryList.indexOf(searchItem);
		if(index>-1)
			return groceryList.get(index);
		return null;
	}

}
