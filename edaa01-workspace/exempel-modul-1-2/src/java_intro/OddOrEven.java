package java_intro;
import java.util.Scanner;

/* Exempel på ett program:
 * Det måste finnas en main-metod. Se de två första och sista
 * raderna som en "ram" runt satserna som exekveras. Programmets
 * namn (här OddOrEven) bestämmer du själv.
 * 
 * { } omsluter raderna i ett block
 * 
 * Variablers typer måste deklareras. Typerna är av två slag; 
 * - primitiva datatyper (ex: int, double, boolean, char)
 * - referens, d.v.s klass eller vektor (ex: Scannner)
 */

public class OddOrEven {
	public static void main(String[] args) {
		System.out.println("Skriv ett heltal: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean odd = n % 2 != 0;
		System.out.println(odd);
		if (odd) {
			System.out.println(n + " är ett udda tal.");
		} else {
			System.out.println(n + " är ett jämnt tal.");
		}
	}
}
