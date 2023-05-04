package divide_and_conquer;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println("n:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		long t0 = System.nanoTime();
		long f = Fibonacci.fastFib(n);
		long t1 = System.nanoTime();
		System.out.println("Fibonacci nbr " + n + " = " + f);
		System.out.println("Exekveringstid: " +
                Math.round((t1 - t0) / 1000000.0) + " ms");
	}

	public static long slowFib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return slowFib(n - 1) + slowFib(n - 2);
		}
	}
	
	public static long fastFib(int n) {
		long[] table = new long[n + 1];
		Arrays.fill(table, -1);
		return fib(n, table);
	}

	private static long fib(int n, long[] table) {
		if (table[n] == -1) {
			if (n <= 1) {
				table[n] = n;
			} else {
				table[n] = fib(n - 1, table) + fib(n - 2, table);
			}

		}
		return table[n];
	}
	
	public static long iterativeFib(int n) {
		if (n <= 1) {
			return n;
		} else {
			long nbr1 = 0;
			long nbr2 = 1; 
			long res = 0;
			for (int i = 2; i <= n; i++) {
				res = nbr1 + nbr2;
				nbr1 = nbr2;
				nbr2 = res;
			}
			return res;
		}
	}
}
