package java_intro;
import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int[] a = new int[4];   // Skapa en vektor med plats för fyra heltal
		                        // Alla vektorelement får startvärdet 0.
		a[0] = 100; // Sätt in talet 100 på position 0 i vektorn
		a[2] = 7;   // Sätt in talet 7 på position 2 i vektorn
		a[3] = a[2];  
		System.out.println(Arrays.toString(a));
		
		// Skapa en vektor med 5 förutbestämda tal
		int[] v = {10, 25, -10, 42, 100};
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		System.out.println(sum);
		
		/* Vektorer är objekt i Java, så a och v är egentligen referens-
		 * variabler som refererar till respektive vektor-objekt.
		 * Fundera vad som händer i de följande satserna. Vilket värde
		 * innehåller b[0] efter de två tilldelningssatserna – 0 eller 42?
		 */
		int[] b = a;
		a[0] = 42;	
		System.out.println(b[0]);
	}
}
	
	