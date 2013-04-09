package com.github;

public class Examples {

	// example of fibonacci iteration
	public static int fi(int n) {
		int p1 = 0, p2 = 1;
		for (int i = 0; i < n; i++) {
			int sp1 = p1;
			p1 = p2;
			p2 = sp1 + p2;
		}
		return p1;
	}

	// example of fibonacci recursion
	public static int fr(int n) {
		if (n < 2)
			return n;
		else
			return fr(n - 1) + fr(n - 2);
	}

}