package bst;

import java.util.ArrayList;
import java.util.Comparator;

import javax.lang.model.util.SimpleElementVisitor14;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.lang.Math;


public class BinarySearchTree<E> {
  BinaryNode<E> root;  // Används också i BSTVisaulizer
  int size;            // Används också i BSTVisaulizer
  private Comparator<E> comparator;
    
	/**
	 * Constructs an empty binary search tree.
	 */
	public BinarySearchTree() {
		size = 0;
	}
	
	/**
	 * Constructs an empty binary search tree, sorted according to the specified comparator.
	 */
	public BinarySearchTree(Comparator<E> comparator) {
		this.comparator = comparator;
	}

	/**
	 * Inserts the specified element in the tree if no duplicate exists.
	 * @param x element to be inserted
	 * @return true if the the element was inserted
	 */
	public boolean add(E x) {
		if (root == null){
			root = new BinaryNode<E>(x);
			size++;
			return true;
		}
		return add(root, x);
	}

	private boolean add(BinaryNode<E> node, E x){
		int compare = comparator.compare(node.element, x);
		if (compare > 0){
			if (node.left != null){
				return add(node.left, x);
			}
			node.left = new BinaryNode<>(x);
			size++;
			return true;
		}
		else if (compare < 0){
			if (node.right != null){
				return add(node.right, x);
			}
			node.right = new BinaryNode<E>(x);
			size++;
			return true;
		}
		return false;
	}
	
	/**
	 * Computes the height of tree.
	 * @return the height of the tree
	 */
	public int height() {
		return height(root);
	}

	private int height(BinaryNode<E> node){
		if (node != null){
			int right = 0;
			int left = 0;
			if (node.right != null){
				right = height(node.right);
			}
			if (node.left != null){
				left = height(node.left);
			}
			return Math.max(left, right) + 1;
		}
		return 0;
	}
	
	/**
	 * Returns the number of elements in this tree.
	 * @return the number of elements in this tree
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Removes all of the elements from this list.
	 */
	public void clear() {
		root = null;
		size = 0;
		
	}
	
	/**
	 * Print tree contents in inorder.
	 */
	public void printTree() {
		printTree(root);
	}

	private void printTree(BinaryNode<E> node){
		if (node != null){
			printTree(node.left);
			System.out.println(node.element);
			printTree(node.right);
		}
	}

	/** 
	 * Builds a complete tree from the elements in the tree.
	 */
	public void rebuild() {
		ArrayList<E> list = new ArrayList<E>();	
		toArray(root, list);
		int size = list.size() - 1;
		root = buildTree(list, 0, size);

	}
	
	/*
	 * Adds all elements from the tree rooted at n in inorder to the list sorted.
	 */
	private void toArray(BinaryNode<E> n, ArrayList<E> sorted) {
		if (n != null)	{
			toArray(n.left, sorted);
			sorted.add(n.element); 
			toArray(n.right, sorted);			
		}
	
	}
	
	/*
	 * Builds a complete tree from the elements from position first to 
	 * last in the list sorted.
	 * Elements in the list a are assumed to be in ascending order.
	 * Returns the root of tree.
	 */
	private BinaryNode<E> buildTree(ArrayList<E> sorted, int first, int last) {
		if (last < first){
			return null;
		}
		int middle = (first+last)/2;
		BinaryNode<E> node = new BinaryNode<E>(sorted.get(middle));
		node.left = buildTree(sorted, first, middle-1);
		node.right = buildTree(sorted, middle +1, last);
		return node;
	}

	static class BinaryNode<E> {
		E element;
		BinaryNode<E> left;
		BinaryNode<E> right;

		private BinaryNode(E element) {
			this.element = element;
		}	
	}
	
}
