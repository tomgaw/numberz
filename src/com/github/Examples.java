package com.github;

public class Examples {

	// fibonacci iteration
	public static int fi(int i){
		return ++i;
	}

	// fibonacci recursion
	public static int fr(int i){
		if (i<2)
			return i;
		else 
		return fr(i-1)+fr(i-2);
	}

}
