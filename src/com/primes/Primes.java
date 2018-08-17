package com.primes;

import java.util.ArrayList;
import java.util.Scanner;

public class Primes {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String cont = "y";
	
	while (cont.equalsIgnoreCase("y")) {
		System.out.println("Which prime are you looking for?");
		int position = scan.nextInt();
		primesList(position);
		System.out.println("The number " + position + " prime is " + primesList(position));
		System.out.println("Would you like to find another prime number? (y/n): \n");
		scan.nextLine();
		cont = scan.nextLine();
	}
	System.out.println("Goodbye!");
	scan.close();
	}
	
	public static int primesList (int position) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // stores prime numbers
		arr.add(2);
		arr.add(3);

		int counter = 4;

		while (arr.size() <= position) {
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
		return arr.get(position-1);
	}
}