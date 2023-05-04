package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MonthAndNbrDays {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Januari", 31);
		map.put("Februari", 28);
		map.put("Mars", 31);
		map.put("April", 30);
		map.put("Maj", 31);
		map.put("Juni", 30);
		map.put("Juli", 31);
		map.put("Augusti", 31);
		map.put("September", 30);
		map.put("Oktober", 31);
		map.put("November", 30);
		map.put("December", 31);
		
		// Söker en nyckels värde. Det är detta mappen är bra på!
		System.out.println("Antal dagar i april: " + map.get("April"));
		System.out.println("Antal dagar i april: " + map.get("Apr")); // null returneras

		System.out.println("Antal dagar i april: " + map.getOrDefault("April", 0)); // 2:a parametern är ett default-värde som  
		                                                                            // returneras om nyckeln inte finns
		System.out.println("Antal dagar i april: " + map.getOrDefault("Apr", 0));   // 0 returneras eftersom Apr inte finns i mappen
		

		Set<String> keys = map.keySet();
		System.out.println("Mängden med nycklar: " + keys);       // skriver ut alla nycklarna
		
		Collection<Integer> values = map.values();
		System.out.println("Samlingen med värden: " + values);    // skriver ut alla värdena
		
		Set<Map.Entry<String, Integer>> pairs = map.entrySet();
		System.out.println("Mängden nyckel-värde-par: " + pairs); // skriver ut alla nyckel-värde-paren
		
		
		// Iterera över nyckel-värde-paren:
		System.out.print("Månader med 31 dagar:");
		map.forEach((key,val) -> {
			if (val == 31) {
				System.out.print(" " + key);
			}
		});
		System.out.println();
		
		// Alternativ med keySet
		System.out.print("Månader med 31 dagar:");
		for (String key : map.keySet()) {
			if (map.get(key) == 31) {
				System.out.print(" " + key);
			}
		}
		System.out.println();
		
		// Alternativ med entrySet
		System.out.print("Månader med 31 dagar:");
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() == 31) {
				System.out.print(" " + e.getKey());
			}
		}
		System.out.println();	
		// I de tre exemplen ovan (som gör samma sak) ser du att det krävs en loop 
		// att söka nyckeln till ett värde. 
		
		
		// Varning: Metoden keySet ger en vy av nycklarna, inte en kopia. 
		// Dvs. borttagning av element i vyn påverkar mappen och tvärtom. 
		// Samma sak gäller metoderna values och entrySet.
		Set<String> myKeys = map.keySet();
		myKeys.clear();
		System.out.println(map);  // Mappen är nu tom
	}
}
