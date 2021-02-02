package Repl;

import java.util.Arrays;

public class q171_ChessBoard {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
		
		for(int i=0;i<8;i++) {
			int k=0;
			for(char j='a';j<='h';j++,k++)
				chessBoard[i][k]=""+(i+1)+j;
		}
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));

	}

}
