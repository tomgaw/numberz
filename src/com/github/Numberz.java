package com.github;

public class Numberz {

	public static void main(String[] args) {
		String s = "5";
		String api = "5.0000";

		// String s = "9.99";
		// String api = "9.990";

		// String s = "10.5";
		// String api = "10.500";

		// trim trailing zeros and trailing .
		api = api.replaceAll("0*$", "").replaceAll("\\.$", "");

		// just to check
		System.out.println(s);
		System.out.println(api);

		// compare
		if (s.equals(api))
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}
