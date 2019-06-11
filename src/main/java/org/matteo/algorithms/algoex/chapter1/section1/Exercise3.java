package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise3 {
  public static void main(String[] args) {
    int intA = StdIn.readInt();
    int intB = StdIn.readInt();
    int intC = StdIn.readInt();       
    
    if (intA == intB && intB == intC) {
      StdOut.println("equal");
    }
    else {
      StdOut.println("not equal");
    }
  }
};
