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
