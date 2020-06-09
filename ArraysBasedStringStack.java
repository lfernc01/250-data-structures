package lec16;

public class ArraysBasedStringStack {
	private String[] stack;
	private int top = -1;
	
	public ArraysBasedStringStack(int capacity) {
		stack = new String[capacity];
	}
	
	public void push(String element) {
		top ++;
		stack[top] = element;
	}
	
	public String pop() {
		String result = stack[top];
		top--;
		return result;
	}
}
