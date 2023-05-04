package bst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bst.BinarySearchTree.BinaryNode;


class TestBST {
	private BinarySearchTree<Integer> intTree; 
	private BinarySearchTree<String> stringTree; 
	
	@BeforeEach
	void setUp() throws Exception {
        intTree = new BinarySearchTree<Integer>((e1, e2) -> (e1).compareTo(e2));
        stringTree = new BinarySearchTree<String>((e1, e2) -> (e1).compareTo(e2)); 
	}

	@AfterEach
	void tearDown() throws Exception {
		intTree = null; 
		stringTree = null; 
	}
	
	@Test
	void testEmpty()	{
		assertEquals(0, intTree.size(), "Wrong size"); 
	}

	
	@Test
	void testHeight() {
		intTree.add(3); 
		intTree.add(5); 
		intTree.add(4); 
        intTree.add(10);
		assertEquals(3, intTree.height(), "Wrong height");
	}
	
	@Test
	void testClear() {
		
		intTree.add(3); 
		intTree.add(5); 
		intTree.clear();
		assertEquals(0, intTree.size(), "Wrong size"); 
	}
	
	@Test
	void printAdd()	{
		
		stringTree.add("Mitten");
		stringTree.add("Fiddeli"); 
		stringTree.add("Wilma"); 
		assertEquals(3, stringTree.size(), "Wrong size");
		stringTree.printTree();
	}
	
	@Test
	void printAddI()	{
		intTree.add(3); 
		intTree.add(5); 
		intTree.add(7); 
		intTree.add(7); 
		assertEquals(3, intTree.size(), "Wrong size");
		intTree.printTree();
	}

}