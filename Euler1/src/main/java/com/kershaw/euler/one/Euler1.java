package com.kershaw.euler.one;

import org.junit.Test;

/**
 * https://projecteuler.net/problem=1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author dkershaw
 * 
 */
public class Euler1 {

	final int LIMIT = 1000;

	/**
	 * Try and brute force the answer
	 */
	@Test
	public void bruteForceSolution() {
		
		int currentSum = 0;
		
		for (int i = 0; i < LIMIT; i++) {
			if (isDivisible(i,3) || isDivisible(i,5)) {
				currentSum += i;
			}
		}
		System.out.println("Sum of all multiples of 3 or 5 below 1000 = " + currentSum);
	}

	private boolean isDivisible(int numerator, int denominator) {
		return numerator % denominator == 0;
	}

}
