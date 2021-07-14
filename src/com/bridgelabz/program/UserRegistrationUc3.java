package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUc3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the email");
		String email = scanner.next();
		System.out.println(Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)", email));
	}
}
