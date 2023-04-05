package com.bridgelabz.genericsmaximumproblem;



public class GenericsMaximumNumber {

	public static <A extends Comparable<A>> A maximum(A x, A y, A z, A u, A v) {

		A max = x;

		if (y.compareTo(max) > 0) {
			max = y;

		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (u.compareTo(max) > 0) {
			max = u;
		}
		if (v.compareTo(max) > 0) {
			max = v;
		}

		
		return max;

		 
	}

	public static void main(String[] args) {

		System.out.println("Maximum String Value : " + maximum('A', 'K', 'S', 'T', 'G'));
	}

}
