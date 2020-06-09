package lec16;

import java.util.Arrays;
import java.util.LinkedList;

public class NiceBoundedIntQueue {
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
