package java_intro;
import java.util.Scanner;

/* Exempel med teckensträngar
 * Om == används jämförs referenser, d.v.s. om referensvariablerna 
 * refererar till samma objekt eller inte.
 * För att jämföra innehållet i strängar används metoden equals.
 */

public class CompareStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		scan.close();
		if (s1 == s2) {
			System.out.println("Samma objekt");
		} else {
			System.out.println("Inte samma objekt");
		}
		if (s1.equals(s2)) {
			System.out.println("Samma innehåll");
		} else {
			System.out.println("Inte samma innehåll");
		}
	}
}
