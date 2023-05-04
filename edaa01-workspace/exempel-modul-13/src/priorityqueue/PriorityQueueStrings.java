package priorityqueue;
import java.util.PriorityQueue;

public class PriorityQueueStrings {
	public static void main(String[] args) {
		// Elementen prioriteras i ordning enligt compareTo i klassen String (lexikografiskt).
		PriorityQueue<String> q = new PriorityQueue<>();
		
		// Långa strängar prioriteras framför korta. Jämförelsen skickas med via ett 
		// komparator-objekt, här i form av ett lambdauttryck.
		// PriorityQueue<String> q = new PriorityQueue<>((s1, s2) -> 21.length() - s1.length());
		
		q.offer("EE");
		q.offer("CCC");
		q.offer("B");
		q.offer("DDDD");
		q.offer("AAAAA");
		
		// Skriver ut hela kön. Observera ingen prioritetsordning.
		System.out.println(q);
		
		// Itererar genom hela kön och skriver ut elementen. Observera ingen prioritetsordning.
		for (String s : q) {
			System.out.println(s);
		}
				
		// Skriver ut med prioriterade elementet
		System.out.println("Mest prioriterade: " + q.peek());
		
		// Tar bort och skriver ut elementen i prioritetsordning
		System.out.println("Elementen i ordning: " + q.peek());
		while(! q.isEmpty()) {
			System.out.println(q.poll());
		}	
	}
}
