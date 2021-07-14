package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUc1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the FirstName");
		String firstName = scanner.next();
		System.out.println(Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName));
	}

}
