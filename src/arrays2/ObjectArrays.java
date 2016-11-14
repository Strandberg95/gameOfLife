package arrays2;

public class ObjectArrays {

	/**
	 * The method returns a String with a comma between every element and a }
	 * after the last one.
	 */
	public static String toString(Object[] array) {
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
	 * Compares the given element with the element at the index i, if they're
	 * the same, i(the index value) is returned. Else -1 is returned.
	 */
	public static int indexOf(Object[] array, Object elem) {
		for (int i = 0; i < array.length; i++) {
			if (elem.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Compares the given element with the element at the index i, if they're
	 * the same, true is returned. Else false is returned.
	 */
	public static boolean member(Object[] array, Object elem) {
		for (int i = 0; i < array.length; i++) {
			if (elem.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Compares the objects in the array, (the compareTo() returns a -1 if its
	 * smaller, 0 if its equal or 1 if its bigger.) So if something is bigger
	 * than 0, its bigger. The object res gets the values of the biggest
	 * element, then gets returned.
	 */
	public static Object max(Object[] array) {
		Object res = array[0];
		Comparable comp;
		for (int i = 0; i < array.length; i++) {
			comp = (Comparable) array[i];
			if (comp.compareTo(res) > 0) {
				res = array[i];
			}
		}
		return res;
	}

	/**
	 * Compares the objects in the array, (the compareTo() returns a -1 if its
	 * smaller, 0 if its equal or 1 if its bigger.) So if something is smaller
	 * than 0, its smaller. The object res gets the values of the smallest
	 * element, then gets returned.
	 */
	public static Object min(Object[] array) {
		Object res = array[0];
		Comparable comp;
		for (int i = 0; i < array.length; i++) {
			comp = (Comparable) array[i];
			if (comp.compareTo(res) < 0) {
				res = array[i];
			}
		}
		return res;
	}
}
