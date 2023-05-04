package compareTime;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CompareSortingTimes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Antal element att sortera: ");
		int size = scan.nextInt();
		scan.close();
		Random rand = new Random();
		int[] a = new int[size];
		int[] b = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt();  // slumpmässig indata
			b[i] = a[i];
		}
//		Arrays.sort(a);  // Ta bort kommentarerna för
//		Arrays.sort(b);  // att testa med sorterad indata
		
		// Quicksort
		long t0 = System.nanoTime();
		Arrays.sort(a);
		long t1 = System.nanoTime();
		System.out.println("Exekveringstid quicksort: " +
		                    Math.round((t1 - t0) / 1000000.0) + " ms");


		// Insertion sort
		t0 = System.nanoTime();
		insertSort(b);
		t1 = System.nanoTime();
		System.out.println("Exekveringstid insert sort: " +
		                    Math.round((t1 - t0) / 1000000.0) + " ms");
	}
	
	/** Sorterar elementen i vektorn a med insättningssortering */
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) { 
			int nextVal = a[i];   // nästa element att sortera in
			int nextPos = i; 
			while (nextPos > 0 && nextVal < a[nextPos - 1]) { 
				a[nextPos] = a[nextPos - 1]; 
				nextPos--; 
			} 
			a[nextPos] = nextVal; 
		} 
	}
}
