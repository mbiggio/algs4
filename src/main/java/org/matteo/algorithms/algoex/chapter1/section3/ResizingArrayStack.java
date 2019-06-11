package org.matteo.algorithms.algoex.chapter1.section3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayStack<Item> implements Iterable<Item> {
	
	@SuppressWarnings("unchecked")
	private Item[] a = (Item[]) new Object[1];
	private int N = 0;
	
	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	@SuppressWarnings("unchecked")
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
	
	public void push(Item item) {
		if (a.length == N) resize(2*a.length);
		a[N++] = item;
	}
	
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if (N > 0 && N == a.length/4) resize(a.length/2);
		return item;
	}
	
	

	private class ReverseArrayIterator implements Iterator<Item> {

		private int i = N;
		
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return a[--i];
		}
		
		@Override
		public void remove() {}		
	}
	
	
	public static void main(String[] args) {
		ResizingArrayStack<String> s = new ResizingArrayStack<>();
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
