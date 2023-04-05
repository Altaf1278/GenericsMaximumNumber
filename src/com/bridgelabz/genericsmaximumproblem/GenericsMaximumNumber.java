package com.bridgelabz.genericsmaximumproblem;

public class GenericsMaximumNumber {

	
		 public static <A extends Comparable<A>> A maximum (A x, A y, A z){
			 
			 A max = x;
			 
			 if (y.compareTo(max) > 0) {
				 max = y;
				 
			 }
			 if (z.compareTo(max)>0) {
				 max = z;
			 }
			 
			 return max;
			 
		 }
		 public static void main(String[] args) {
			System.out.println ( "Maximum Float Value is : " +maximum(5.4, 6.9, 1.42));
		 }
	}

