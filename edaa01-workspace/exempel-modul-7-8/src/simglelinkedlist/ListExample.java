package simglelinkedlist;

public class ListExample {
	public static void main(String[] args) {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		for (int n : list) { // Fungerar bara om SingleLinkedList implementerar Iterable
			System.out.println(n);

		}
	}
}
