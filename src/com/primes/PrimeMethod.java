package com.primes;

import java.util.ArrayList;
//import java.util.Scanner;

public class PrimeMethod {
	public static int prime(int inp) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); // stores prime numbers
		arr.add(2);
		arr.add(3);

		int counter = 4;

		while (arr.size() <= inp) {

			if (counter % 2 != 0) {

				int temp = counter / 2;
				while (temp >= 3) {
					if (counter % temp == 0)
						break;
					temp--;
				}
				if (temp <= 3) {
					arr.add(counter);
				}
			}
			counter++;
		}

		System.out.println("finish" + arr.get(inp));
		return arr.get(inp);
	}
}