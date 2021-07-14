package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUc5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the PassWord");
		String passWord = scanner.next();
		System.out.println(Pattern.matches("^[A-Z]{1,}[a-zA-Z]{7,}+[0-9]{1,}?[#!%&*~@]{1,}$", passWord));
	}
}
