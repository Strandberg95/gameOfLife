package arrays2;

public class Integer2DArrays1 {

	/**
	 * Uses the method in class IntegerArrays, then adds either "}" or "," to
	 * the String depending on where we are in the array. Returns the String.
	 */
	public static String toString(int[][] array) {

		String res = "{";
		for (int i = 0; i < array.length; i++) {
			
			if (i == array.length - 1) {
				res += IntegerArrays.toString(array[i]) + "}";
			} else {
				res += IntegerArrays.toString(array[i]) + ",";
			}
		}
		return res;
	}

	/**
	 * The method goes through all the elements and for each element it adds 1
	 * to the variable "elem". Returns "elem".
	 */
	public static int elements(int[][] array) {
		
		int elem = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				elem++;
			}
		}
		return elem;
	}

	/**
	 * The method uses the max() in the class IntegerArrays. We send in each row
	 * with all the columns in it at a time and get back the max value of that
	 * row. The variable "rowMax" gets the value of the returned element.
	 * Variable "max" gets the value of rowMax if "rowMax" is bigger. Returns
	 * "max".
	 */
	public static int max(int[][] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			int rowMax = IntegerArrays.max(array[i]);
			if (rowMax > max) {
				max = rowMax;
			}
		}
		return max;
	}

	/**
	 * The method uses the min() in the class IntegerArrays. We send in each row
	 * with all the columns in it at a time and get back the minimum value of
	 * that row. The variable "rowMin" gets the value of the returned element.
	 * Variable "min" gets the value of "rowMin" if rowMax is smaller. Returns
	 * "min".
	 */
	public static int min(int[][] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			int rowMin = IntegerArrays.min(array[i]);
			if (rowMin < min) {
				min = rowMin;

			}
		}
		return min;
	}

	/**
	 * The method uses the sum() in the class IntegerArrays. We get the sum of
	 * all columns in each row returned and adds it to the variable "sum".
	 * Returns sum.
	 */
	public static int sum(int[][] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			int rowSum = IntegerArrays.sum(array[i]);
			sum += rowSum;
		}
		return sum;
	}

	/**
	 * Using the sum() and elements() the method gets the sum and the number of
	 * elements, converts it to float numbers than divides the sum with the
	 * elements to get the average. Returns "avg"
	 */
	public static double average(int[][] array) {
		double avg = (float) Integer2DArrays1.sum(array) / Integer2DArrays1.elements(array);

		return avg;
	}
}
