package binarysearchtree;
public class Main {
	public static void main(String[] args) {
		// Träd sorterat efter id-nummer
		// BinarySearchTree<Person> bst = new BinarySearchTree<Person>();

		// Träd sorterat efter namn
		BinarySearchTree<Person> bst = new BinarySearchTree<Person>((p1, p2) -> 
		                                   p1.getName().compareTo(p2.getName()));
		bst.add(new Person("Fili", 1));
		bst.add(new Person("Balin", 2));
		bst.add(new Person("Dori", 4));
		bst.add(new Person("Kili", 3));

		// Sök efter personen med nr 2
		// Person p = bst.find(new Person(null, 2));
		// System.out.println(p);

		// Sök efter personen med namnet Balin
		Person p = bst.find(new Person("Balin", -1));
		System.out.println(p);
	}
}
