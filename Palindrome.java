package lec16;

import java.util.Stack;

public class Palindrome {

	public static boolean isPalindrome(String d) {
		char[] phrase = d.toLowerCase().replaceAll("\\w", "").toCharArray();
		for(int i=0; i<phrase.length; i++) {
			if(phrase[i] != phrase[phrase.length-i-1])
				return false;
		}
		return true;
		}
	
	public static boolean isPalindromeStack1(String d) {
		char[] phrase = d.toLowerCase().replaceAll("\\w", "").toCharArray();
		Stack<Character> first = new Stack<>();
		
		for( int i=0; i<phrase.length/2; i++) 
				first.push(phrase[i]);
		
		
		for( int i=0; i<phrase.length/2 + phrase.length%2; i++) {
				if(phrase[i] != first.pop()) {
					return false;
				}	
		}
		return true;
	}
	
	public static boolean isPalindromeStack2(String d) {
		char[] phrase = d.toLowerCase().replaceAll("\\w", "").toCharArray();
		Stack<Character> first = new Stack<>();
		Stack<Character> second = new Stack<>();
		
		for( int i=0; i<phrase.length/2; i++) 
				first.push(phrase[i]);
		
		for (int i=phrase.length/2 + phrase.length%2; i<phrase.length;  i++) 
				second.push(phrase[i]);
		
		Stack<Character> reversed = new Stack<>();
		while(!second.isEmpty()) {
			reversed.push(second.pop());
		
		}
		
		while(!first.isEmpty()) {
			if(!first.pop().equals(reversed.pop()))
				return false;
		}
		
		return true;
	}
	}
