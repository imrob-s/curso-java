package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposity (y/n)?: ");
		char c = sc.next().charAt(0);
		double balance = 0;
		
		if (c == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
		Account acc = new Account(number, name, balance);
		System.out.println("\nAccount data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a deposit value: ");
		double valor = sc.nextDouble();
		acc.deposit(valor);
		System.out.println("Update account data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		valor = sc.nextDouble(); 
		acc.withdraw(valor);
		System.out.println("Update account data:");
		System.out.println(acc);
		
		sc.close();
	}
}