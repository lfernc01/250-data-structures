package lec16;
import java.util.ArrayList;

public class ListBasedStringStack {
	private ArrayList<String> stack = new ArrayList<>();
	
	public void push(String element) {
		stack.add(element);
	}
	
	public String pop() {
		return stack.remove(stack.size()-1);
	}
}
