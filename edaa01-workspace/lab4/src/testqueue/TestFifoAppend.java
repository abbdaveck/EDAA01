package testqueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import queue_delegate.FifoQueue;
import queue_singlelinkedlist.FifoQueue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Iterator;

/**
 * @author david
 *
 */
class TestFifoAppend {
	private FifoQueue<Integer> myIntQueue1;
	private FifoQueue<Integer> myIntQueue2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		myIntQueue1 = new FifoQueue<Integer>();
		myIntQueue2 = new FifoQueue<Integer>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		myIntQueue1 = null;
		myIntQueue2 = null;
	}


	
	/**
	 * Test that two empty queues cant be appended to each other.
	 */
	@Test
	void testAppendTwoEmptyQueues() {
		assertDoesNotThrow(() -> myIntQueue1.append(myIntQueue2),  "There was an error.");
		assertEquals(0, myIntQueue1.size(), "Wrong size of empty queue");
		assertEquals(0, myIntQueue2.size(), "Wrong size of empty queue");

	}

	/**
	 * Test that an empty queue can be appended to a non empty queue.
	 */
	@Test
	void testEmptyAppendToNonEmpty() {
		myIntQueue2.offer(2);
		assertDoesNotThrow(() -> myIntQueue1.append(myIntQueue2),  "There was an error.");
		assertEquals(1, myIntQueue1.size(), "Wrong size of queue, expected 1");
		assertEquals(2, myIntQueue1.element(), "Wrong element in queue, expected the integer 2");
		assertEquals(0, myIntQueue2.size(), "Wrong size of empty queue");
	}
	
	/**
	 * Test that a non empty queue can be appended to an empty queue.
	 */
	@Test
	void testNonEmptyAppendToEmpty() {
		myIntQueue1.offer(1);
		assertDoesNotThrow(() -> myIntQueue1.append(myIntQueue2),  "There was an error.");
		assertEquals(1, myIntQueue1.size(), "Wrong size of queue, expected size 1");
		assertEquals(1, myIntQueue1.element(), "Wrong element in queue, expected the integer 1");
		assertEquals(0, myIntQueue2.size(), "Wrong size of empty queue");
	}

	
	/**
	 * Test that a non empty queue can be appended to another non empty queue.
	 */
	@Test
	void testAppend() {
		myIntQueue1.offer(1);
		myIntQueue2.offer(2);
		assertDoesNotThrow(() -> myIntQueue1.append(myIntQueue2),  "There was an error.");
		assertEquals(2, myIntQueue1.size(), "Wrong size of queue, expected 2");
		
        Iterator<Integer> it = myIntQueue1.iterator();
		StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next());
        }
		assertEquals(12, Integer.parseInt(sb.toString()), "Wrong elements in queue, expected the integer 1 and 2");
		assertEquals(0, myIntQueue2.size(), "Wrong size of empty queue");
	}


	/**
	 * Test that a queue can't be appended to itself.
	 */
	@Test
	void testAppendQueueToItself() {
		myIntQueue1.offer(1);
		assertThrows(IllegalArgumentException.class, () -> myIntQueue1.append(myIntQueue1), "Didn't throw the error expected.");
		assertEquals(1, myIntQueue1.size(), "Wrong size of queue, expected 1");
		assertEquals(1, myIntQueue1.element(), "Wrong element in queue, expected the integer 1");
		assertEquals(0, myIntQueue2.size(), "Wrong size of empty queue");
	}

}
