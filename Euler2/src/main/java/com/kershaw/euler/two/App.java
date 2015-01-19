package com.kershaw.euler.two;

import org.junit.Test;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author dkershaw
 * 
 */
public class App {

	private static final int LIMIT = 4000000;

	@Test
	public void Euler2() {

		int sum = 0;
		int current = 1;
		int index = 1;

		do {
			current = fib(index);
			if (current % 2 == 0) {
				sum += current;
			}
			index++;
		} while (current < LIMIT);
		System.out.println(sum);
	}

	private int fib(int current) {

		if (current <= 1) {
			return current;
		} else
			return fib(current - 1) + fib(current - 2);
	}

}