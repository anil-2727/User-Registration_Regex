package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUc4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Phone Number:");
		String phoneNumber = scanner.next();
		System.out.println(Pattern.matches("^(0|91)+[7-9][0-9]{9}$", phoneNumber));
	}

}
