package binarysearchtree;
import java.util.Comparator;

public class BinarySearchTree<E> {
	private Node<E> root;
	private Comparator<E> comp;
	
	/**
	 * Skapar ett tomt binärt sökträd. Elementen förutsätts vara av en klass som
	 * implementerar Comparable<E>.
	 */
	public BinarySearchTree() {
		root = null;
		comp = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
	}

	/**
	 * Skapar ett tomt binärt sökträd. Elementen jämförs med komparatorn comp.
	 */
	public BinarySearchTree(Comparator<E> comp) {
		root = null;
		this.comp = comp;
	}
		
	/** Statiskt nästlad klass - beskriver en nod i trädet. */
	private static class Node<E> {
		private E data;
		private Node<E> left;
		private Node<E> right;

		private Node(E data) {
			this.data = data;
			left = right = null;
		}
	}
	
	/**
	 * Returnerar det element som matchar target. Om ett sådant element inte
	 * finns returneras null.
	 */
	public E find(E x) {
		return find(root, x);
	}
	
	private E find(Node<E> n, E x) {
		if (n == null) {
			return null;
		} 
		int compResult = comp.compare(x, n.data);
		if (compResult == 0) {
			return n.data;
		} else if (compResult < 0) {
			return find(n.left, x);
		} else {
			return find(n.right, x);
		}
	}
	
	/** Skriver ut trädet i inorder */
	public void print() {
		print(root);
	}

	/* Skriver ut det träd där n är rot i inorder. */
	private void print(Node<E> n) {
		if (n != null) {
			print(n.left);
			System.out.println(n.data);
			print(n.right);
		}
	}
	
	/**
	 * Sätter in elementet item i trädet. Om insättningen lyckades (ingen
	 * dubblett finns) returneras true, annars false.
	 */
	public boolean add(E e) {
		// Implementeras på lab.
		return false;
	}
	
	
}
