package binarysearch;
import java.util.Comparator;

public class BinarySearch {
	
	/**
	 * Returns the index of x if found in the array a, otherwise -1.
	 * The array must be sorted prior to making this call.
	 * 
	 * @param a
	 *            the array to be searched
	 * @param x
	 *            the the value to be searched for
	 * @return index of searched value, if it is contained in the array, otherwise -1
	 */
	public static int indexOf(int[] a, int x) {
		return binarySearch(a, x, 0, a.length - 1);
	}
	
	private static int binarySearch(int[] a, int x, int first, int last) {
		if (first > last) {
			return -1; 
		} else {
			int mid = first + ((last - first) / 2);
			if (x == a[mid]) {
				return mid;
			} else if (x < a[mid])  {
				return binarySearch(a, x, first, mid - 1);
			} else {
				return binarySearch(a, x, mid + 1, last);
			}
		}
	}
	
	/**
	 * Returns the index of the specified object if found in the array a, 
	 * otherwise -1. The array must be sorted into ascending order according
	 * to the natural ordering of its elements prior to making this call.
	 * 
	 * @param a
	 *            the array to be searched
	 * @param x
	 *            the the value to be searched for
	 * @return index of searched value, if it is contained in the array, otherwise -1
	 */
	public static <E> int indexOf(E[] items, E target) {
		return binarySearch(items, target, 0, items.length - 1);
	}
	
	private static <E> int binarySearch(E[] items, E target, int first, int last) {
		if (first > last) {
			return -1;
		} else {
			int mid = first + ((last - first) / 2);
			int compResult = ((Comparable<E>) target).compareTo(items[mid]);
			if (compResult == 0) {
				return mid;
			} else if (compResult < 0)  {
				return binarySearch(items, target, first, mid - 1);
			} else {
				return binarySearch(items, target, mid + 1, last);
			}
		}
	}
	
	/**
	 * Returns the index of the specified object if found in the array a, 
	 * otherwise -1.  The array must be sorted into ascending order according
	 * to the natural ordering of its elements prior to making this call.
	 * 
	 * @param a
	 *            the array to be searched
	 * @param x
	 *            the the value to be searched for
	 * @param comp
	 *            the comparator by which the array is ordered. 
	 * @return index of searched value, if it is contained in the array,
	 *         otherwise -1
	 */
	public static <E> int indexOf(E[]a, E x, Comparator<E> comp) {
		return binarySearch(a, x, 0, a.length-1, comp);
	}
	
	private static <E> int binarySearch(E[]a, E x, int first, int last, Comparator<E> comp) {
		if (first > last) {
			return -1;
		}
		int mid = first + ((last - first) / 2);
		int compResult = comp.compare(x, a[mid]);
		if (compResult == 0) {
			return mid;
		} else if (compResult < 0) {
			return binarySearch(a, x, first, mid -1, comp);
		} else {
			return binarySearch(a, x, mid + 1, last, comp);
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {12, 35, 42, 58, 104, 200, 315, 431};
		System.out.println(BinarySearch.indexOf(numbers, 42) == 2);
		
		String[] strings = {"AAAAA", "BBBB", "CCC", "DD", "E"};
		System.out.println(BinarySearch.indexOf(strings, "E") == 4);
	}	
}