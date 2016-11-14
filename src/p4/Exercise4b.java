package p4;

import javax.swing.JOptionPane;

import arrays2.Integer2DArrays1;

public class Exercise4b {
	public void testArray(int[][] array) {
		String message = "";
		message += "toString: " + Integer2DArrays1.toString(array) + "\n";
		message += "elements: " + Integer2DArrays1.elements(array) + "\n";
		message += "max: " + Integer2DArrays1.max(array) + "\n";
		message += "min: " + Integer2DArrays1.min(array) + "\n";
		message += "sum: " + Integer2DArrays1.sum(array) + "\n";
		message += "average: " + String.format("%1.2f", Integer2DArrays1.average(array)) + "\n";
		JOptionPane.showMessageDialog(null, message);
	}

	public static void main(String[] args) {
		Exercise4b e4b = new Exercise4b();
		int[][] test1 = { { 1, 2, 3, 4 }, { -5, -6, -7, -18 }, { 10, 9, 8, 7 } };
		int[][] test2 = { { 1, 2, 3, 4, 5, 6 }, { -7, -8, -9 }, { 2, 5, 8, 11, 8 }, { 6, 4 } };
		e4b.testArray(test1);
		e4b.testArray(test2);
	}
}
