
public class ArraysSS {
	private String[] stack;
	private int top = -1;
	
	public ArraysSS(int capacity) {
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

public class ListSS {
	private ArrayList<String> stack = new ArrayList<>();
	
	public void push(String element) {
		stack.add(element);
	}
	
	public String pop() {
		return stack.remove(stack.size()-1);
	}
}
