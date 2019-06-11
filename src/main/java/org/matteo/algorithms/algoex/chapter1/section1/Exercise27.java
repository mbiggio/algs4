package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise27 {

	public static double binomial(int N, int k, double p) {
		if ((N == 0) && (k == 0)) return 1.0;
		if ((N  < 0) || (k  < 0)) return 0.0;
		return (1 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
	}

	public static double binomialDp(int N, int k, double p) {
		double[] m = new double[k+1]; m[0]=1.0;
		for (int i=1; i<=k; i++) {
			m[i]=0.0;
		}

		for (int n=1; n<=N; n++) {
			double[] m2 = new double[k+1];
			for (int i=0; i<=k; i++) {
				m2[i] = (1-p) * m[i];
				if (i>0) m2[i] += p * m[i-1];
			}
			m = m2;
		}
		return m[k];
	}

	public static void main(String[] args) {
		StdOut.println(binomial(10, 5, 0.25));
		StdOut.println(binomialDp(10, 5, 0.25));
	}
}
