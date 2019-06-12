package org.matteo.algorithms.algoex.chapter1.section3;

public class Exercise1_FixedCapacityStackOfStrings {
	
	private String a[];
	private int N; 

	public Exercise1_FixedCapacityStackOfStrings(int cap) {
		a = new String[cap];
		N = 0;
	}

	public void push(String item) {
		a[N++] = item;
	}

	public String pop() {
		return a[--N];
	}

	public boolean isEmpty() {
		return N == 0;
	}
	
	public boolean isFull() {
		return N == a.length-1;
	}

	public int size() {
		return N;
	}	

}
