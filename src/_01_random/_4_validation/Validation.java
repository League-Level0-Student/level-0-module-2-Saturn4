//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		
		if (randomNumber == 0) {
			System.out.println("You're Rad");
		}
		else if(randomNumber == 1) {
			System.out.println("You're cooler than ice!");
		}
		else if ( randomNumber == 2) {
			System.out.println("You Shine Bright!");
		}
		else if (randomNumber == 3) {
			System.out.println("You rock");
		}
		else if (randomNumber == 4) {
			System.out.println("The sun is brighter with you around!");
		}
		else if (randomNumber == 5) {
			System.out.println("vYou are very intelligent.");
		}
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
