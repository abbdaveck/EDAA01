package jcf;

import java.util.PriorityQueue;

public class PriorityQueueExample{
	public static void main(String[] args) {
		PriorityQueue<Double> q = new PriorityQueue<>();
		q.offer(10.7);
		q.offer(5.5);
		q.offer(0.8);
		q.offer(15.2);
		q.offer(3.4);
				
		// Skriver ut minsta elementet
		System.out.println("Minsta: " + q.peek());
		
		// Tar bort och skriver ut de tre minsta elementen i ordning
		for(int i = 0; i < 3; i++) {
			System.out.println(q.poll());
		}	
	}
}
