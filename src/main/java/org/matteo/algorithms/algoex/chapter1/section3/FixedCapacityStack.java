package org.matteo.algorithms.algoex.chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item> {
	private Item a[];
	private int N; 
	
	@SuppressWarnings(value = { "unchecked" })
	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object[cap];
		N = 0;
	}
	
	public void push(Item item) {
		a[N++] = item;
	}
	
	public Item pop() {
		return a[--N];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	
	public static void main(String[] args) {
		FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			}
			else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
		}
		StdOut.println("(" + s.size() + " left on stack)");
	}
	
	
}
