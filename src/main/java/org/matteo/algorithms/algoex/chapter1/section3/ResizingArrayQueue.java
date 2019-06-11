package org.matteo.algorithms.algoex.chapter1.section3;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayQueue<Item> implements Iterable<Item> {

	@SuppressWarnings("unchecked")
	private Item[] a = (Item[]) new Object[1]; 	
	private int head = 0;
	private int tail = 0;	
	// We need to distinguish these two situations:
	// * queue empty 
	// * queue full
	// In both these cases, head == tail, 
	// so we cannot rely on head and tail to distinguish these cases.
	// That's why we need to keep track of the number of items.
	private int items = 0;

	public void enqueue(Item item) {
		if (items == a.length) {
			resize(2*a.length);
		}				
		a[tail] = item;
		tail = (tail + 1) % a.length;
		items++;
	}

	public Item dequeue() {
		if (isEmpty()) throw new NoSuchElementException("empty queue");
		Item item = a[head];
		a[head] = null;
		head = (head + 1) % a.length;		
		items--;
		if (items > 0 && items == a.length/4) resize(a.length/2);
		return item;
	}

	public boolean isEmpty() {
		return items == 0;
	}

	public int size() {
		return items;
	}

	@SuppressWarnings("unchecked")
	private void resize(int size) {
		assert size >= items;
		Item[] temp = (Item[]) new Object[size];
		for (int i = 0; i < items; i++) {
			temp[i] = a[(i + head) % a.length];
		}
		head = 0;
		tail = items;
		a = temp;
	}

	@Override
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}

	private class QueueIterator implements Iterator<Item> {

		private int current = 0;

		@Override
		public boolean hasNext() {			
			return current < items;
		}

		@Override
		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
			Item item = a[(current + head) % a.length];
			current++;
			return item;
		}		
	}


	public static void main(String[] args) {
		ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) queue.enqueue(item);
			else if (!queue.isEmpty()) StdOut.print(queue.dequeue() + " ");
		}
		StdOut.println("(" + queue.size() + " left on queue)");
	}

}
