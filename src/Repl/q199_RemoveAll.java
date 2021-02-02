package Repl;

import java.util.ArrayList;

public class q199_RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add(targetWord);
		wordList.removeAll(strList);
	}

}
