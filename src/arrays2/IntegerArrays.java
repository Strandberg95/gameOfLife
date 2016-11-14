package arrays2;

public class IntegerArrays {

	/**
	 * The method returns a String with a comma between every element and a }
	 * after the last one.
	 */
	public static String toString(int[] array) {
		String res = "{";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				res += array[i] + "}";
			} else {
				res += array[i] + ", ";
			}
		}
		return res;
	}

	/**
	 * The method goes through the array and compares the elements with the max
	 * variable, sets the "max" variable to the biggest element, then returns
	 * "max"
	 */
	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * The method goes through the array and compares the elements with the
	 * "min" variable, sets the "min" variable to the smallest element, then
	 * returns "min"
	 */
	public static int min(int[] array) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * The method goes through the array and adds the value of each element to
	 * the variable "sum" then returns "sum".
	 */
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	/**
	 * The method sets the "nbr" variable to the length of the array, then the
	 * variable "sum" gets the value from sum(). Converts it to a float divides
	 * sum with nbr and returns the average.
	 */
	public static double average(int[] array) {
		int nbr = array.length;
		int sum = IntegerArrays.sum(array);
		double avg = (float) sum / nbr;
		return avg;
	}

	/**
	 * The method subtracts the min from the max and returns the range between
	 * them.
	 */
	public static int range(int[] array) {
		int range = IntegerArrays.max(array) - IntegerArrays.min(array);
		return range;
	}

	/**
	 * Sorts the array in an ascending order.
	 */
	public static void sortAsc(int[] array) {
		java.util.Arrays.sort(array);
	}

	/**
	 * Sorts the array in an ascending order, then reverses the array using
	 * bubble sort. "Swap" gets the value of the element at position i, then the
	 * element at position i gets the value of the last element minus i(positions);
	 */
	public static void sortDesc(int[] array) {
		java.util.Arrays.sort(array);
		for (int i = 0; i < array.length / 2; i++) {
			int swap = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = swap;
		}
	}

	/**
	 * Clones the array then returns a copy.
	 */
	public static int[] copy(int[] array) {
		int[] arrayCopy = array.clone();
		return arrayCopy;
	}

}
