package queue_singlelinkedlist;
import java.util.*;

public class FifoQueue<E> extends AbstractQueue<E> implements Queue<E> {
	private QueueNode<E> last;
	private int size;

	public FifoQueue() {
		super();
		last = null;
		size = 0;
	}


	/**	
	 * Inserts the specified element into this queue, if possible
	 * post:	The specified element is added to the rear of this queue
	 * @param	e the element to insert
	 * @return	true if it was possible to add the element 
	 * 			to this queue, else false
	 */
	public boolean offer(E e) {
		try {
			QueueNode<E> n = new QueueNode<E>(e);
			if (last == null){		//Om listan är tom:
				last = n;			//Sista noden är numera noden som las till
				n.next = n;			//Noden som las till referar till sig själv
			} else {				//Om den inte är tom:
				n.next = last.next;	//Noden som las till referar till första noden i ursprungliga kön
				last.next = n;		//Den sista noden referar till den nya noden 
				last = n;			//Gör så att den nya noden är sist
			}
			size++;
			return true;

		} catch (Exception e2) {
			return false;
		}
	}


	/**	
	 * Checks if the Queue is empty
	 * @return	true if it is empty else false
	 */
	public boolean isEmpty() {
		if (size != 0){
			return false;
		}
		else{
			return true;
		}
	}
	

	/**	
	 * Returns the number of elements in this queue
	 * @return the number of elements in this queue
	 */
	public int size() {
		if (last == null){
			size = 0;
		}
		return size;
	}
	

	/**	
	 * Retrieves, but does not remove, the head of this queue, 
	 * returning null if this queue is empty
	 * @return 	the head element of this queue, or null 
	 * 			if this queue is empty
	 */
	public E peek() {
		if (last != null ){
			return last.next.element;
		} else {
			return null;
		}
	}

	/**	
	 * Retrieves and removes the head of this queue, 
	 * or null if this queue is empty.
	 * post:	the head of the queue is removed if it was not empty
	 * @return 	the head of this queue, or null if the queue is empty 
	 */
	public E poll() {
		if (last == null){
			return null;
		}
		else if (last == last.next){		//Om listan har bara en nod
			QueueNode<E> tempNode = last;	
			last = null;					//Tömmer hela listan genom att sätta den till null
			size--;
			return tempNode.element;
		}
		else{
			QueueNode<E> tempNode = last.next;
			last.next = last.next.next;		//"Hoppar över" det första noden i listan, 
			size--;							//den "glöms" då vilket är ekvivalent med att den tas bort
			return tempNode.element;
		}
	}


	/**
	* Appends the specified queue to this queue
	* post: all elements from the specified queue are appended
	* to this queue. The specified queue (q) is empty after the call.
	* @param q the queue to append
	* @throws IllegalArgumentException if this queue and q are identical
	*/
	public void append(FifoQueue<E> q){
		if (q.last != null){
			QueueNode<E> addedQueue = q.last;
			if (addedQueue == last && last != null){
				throw new IllegalArgumentException("You cant append a queue to itself");
			}
			else if (last == null){
				last = addedQueue;
			}
			else {
				QueueNode<E> tempQueueNode = last.next;		//Skapar en temporär kö av de ursprungliga kön där också "starten" på kön är huvudet
				last.next = addedQueue.next;				//Gör slutet på den ursprungliga kön pekar på huvudet den nya kön
				addedQueue.next = tempQueueNode;			//Gör så att slutet på den nya kön pekar på huvudet av den temporära kön
				last = addedQueue;							//Sätter slutet på kön till den sista noden
			}
			size += q.size();
			q.last = null;
		}
	}


	/**	
	 * Returns an iterator over the elements in this queue
	 * @return an iterator over the elements in this queue
	 */	
	public Iterator<E> iterator () {
		Iterator<E> it = new QueueIterator();
		return it;
	}

	private class QueueIterator implements Iterator<E> {
		private QueueNode<E> pos;
		Boolean firstRun;

		private QueueIterator() {
			if (last != null){
				pos = last.next;
				firstRun = true;
			}
		}
		public boolean hasNext() {
			if (pos == null){
				return false;
			}
			else if(pos != pos.next && firstRun){
				return true;
			}
			else{
				return false;
			}
		}
		public E next() {
			if (!hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			E queueElement = pos.element;
			if(pos.next != last.next){
				pos = pos.next;
			}
			else{
				firstRun = false;
			}
			return queueElement;
		}
	}
	
	private static class QueueNode<E> {
		E element;
		QueueNode<E> next;

		private QueueNode(E x) {
			element = x;
			next = null;
		}
	}

}
