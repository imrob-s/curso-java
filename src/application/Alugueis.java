package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Alugueis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rent = new Rent[9];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			rent[room] = new Rent(name, email, room);
		}
		System.out.println("Busy rooms:");
		for (int i=0; i<rent.length; i++) {
			if(rent[i] != null) {
				System.out.println(rent[i]);				
			}
		}	
		sc.close();
	}

}
