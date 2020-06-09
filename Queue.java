import java.util.Arrays;
import java.util.LinkedList;
import java.io.*;
import java.util.Exceptions;

public class HarshBoundedQueue {
	private LinkedList<Integer> a = new LinkedList<Integer>();
	private int capacity = 10;
	
	public HarshBoundedIntQueue(int c) {
		capacity = c;
	}
	
	public void enqueu(int value) {
		if(a.size() == capacity)
			throw new FullQueueException();
		
		a.add(value);
	}
	
	public boolean isEmpty() {
		return a.isEmpty();
	}
	
	public int dequeu() {
		if(isEmpty())
			throw new EmptyQueueException();
		return a.removeFirst();
	}
	
	public String toString() {
		return Arrays.deepToString(a.toArray());
	}

}

public class NiceBoundedQueue {
	private LinkedList<Integer> a = new LinkedList<>();
	private int capacity = 10;
	
	public NiceBoundedIntQueue(int c) {
		capacity = c;
	}
	
	public boolean enqueue(int value) {
		if(a.size() == capacity)
			return false;
		a.add(value);
		return true;
	}
	
	public boolean isEmpty() {
		return a.isEmpty();
	}
	
	public int dequeu() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		return a.removeFirst();
	}
	
	public String toString() {
		return Arrays.deepToString(a.toArray());
	}


}
