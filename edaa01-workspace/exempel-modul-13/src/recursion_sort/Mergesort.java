package recursion_sort;
import java.util.Arrays;

public class Mergesort {
	
	public static void sort(int[] a) {
		int[] tmpArray = new int[a.length];
		mergeSort(a,tmpArray, 0, a.length - 1);
	}
	
	private static void mergeSort(int[] a, int[] tmpArray, int first, int last) {
		if (first < last) {
			int mid = first + (last - first) / 2;
			mergeSort(a, tmpArray, first, mid);
			mergeSort(a, tmpArray, mid + 1, last);
			merge(a, tmpArray, first, mid + 1, last);
		}
	}
	
	private static void merge(int[] a, int[] tmpArray, int leftPos, 
			                  int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int leftStart = leftPos;
		// Så länge element "finns kvar" i bägga halvorna
		//    välj minsta och lägg in tmpArray
		while(leftPos <= leftEnd && rightPos <= rightEnd) {
			if (a[leftPos] <= a[rightPos]) {
				tmpArray[tmpPos++] = a[leftPos++];
			} else {
				tmpArray[tmpPos++] = a[rightPos++];
			}
		}
		// Kopiera ev resterande element från vänster halva till tmpArray
		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = a[leftPos++];
		}
		// Kopiera ev resterande element från höger halva till tmpArray
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = a[rightPos++];
		}
		// Kopiera  elementen från tmpArray till a
		for (int i = leftStart; i <= rightEnd; i++) {
			a[i] = tmpArray[i];
		}
	}
	
	
	public static void sort(Object[] a) {
		Object[] tmpArray = new Object[a.length];
		mergeSort(a,tmpArray, 0, a.length - 1);
	}
	
	private static void mergeSort(Object[] a, Object[] tmpArray, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(a, tmpArray, first, mid);
			mergeSort(a, tmpArray, mid + 1, last);
			merge(a, tmpArray, first, mid + 1, last);
		}
	}
	
	private static void merge(Object[] a, Object[] tmpArray, 
			int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int leftStart = leftPos;
		while(leftPos <= leftEnd && rightPos <= rightEnd) {
			if (((Comparable) a[leftPos]).compareTo(a[rightPos]) <= 0) {
				tmpArray[tmpPos++] = a[leftPos++];
			} else {
				tmpArray[tmpPos++] = a[rightPos++];
			}
		}
		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = a[leftPos++];
		}
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = a[rightPos++];
		}
		for (int i = leftStart; i <= rightEnd; i++) {
			a[i] = tmpArray[i];
		}
	}
	
	
	public static void main(String[] args) {
		Integer[] nbrs = {7, 2, 5, 9, 3, 8, 10, 2};
		Mergesort.sort(nbrs);
		System.out.println(Arrays.toString(nbrs));

		String[] words = {"BBBB", "CCC","AAAAA", "E", "DD"};
		Mergesort.sort(words);
		System.out.println(Arrays.toString(words));
	}

}
