package jcf;

import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		TreeSet<Integer> uniqueNbrs = new TreeSet<Integer>();
		uniqueNbrs.add(53);
		uniqueNbrs.add(-11);
		uniqueNbrs.add(-11);
		uniqueNbrs.add(-11);
		uniqueNbrs.add(42);
		uniqueNbrs.add(-8);
		uniqueNbrs.add(42);
		
		// Dubbletter har inte satts in
		System.out.println(uniqueNbrs);
		System.out.println(uniqueNbrs.size());
		
		// Sökning i mängden
		System.out.println(uniqueNbrs.contains(41));

		// Iterera genom mängden
		int sum = 0;
		for (int n : uniqueNbrs) {
			sum += n;
		}
		System.out.println(sum);
	}
}
