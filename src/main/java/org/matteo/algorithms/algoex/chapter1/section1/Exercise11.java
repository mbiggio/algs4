package org.matteo.algorithms.algoex.chapter1.section1;

public class Exercise11 {

	public static void main(String[] args) {
		boolean[][] array = 
			{{true, true, false},
					{true, false, true}, 
					{false, true, false},
					{false, false, true}};

		toString(array);
	}

	private static void toString(boolean[][] boolArray) {
		for (int i=0; i<boolArray.length; i++) {
			for (int j=0; j<boolArray[0].length; j++) {
				System.out.print(boolArray[i][j]?"* ":"  " );
			}   
			System.out.println();
		}   
	}
};
