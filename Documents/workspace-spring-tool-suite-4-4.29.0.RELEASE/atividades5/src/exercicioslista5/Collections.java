package exercicioslista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe a " + (i + 1) + "º cor: ");
			cores.add(lerScanner.nextLine());
		}

		lerScanner.close();

		System.out.println("\nCores informadas:");
		for (String cor : cores) {
			System.out.println("- " + cor);
		}

		cores.sort(String::compareToIgnoreCase);
		System.out.println("\nCores ordenadas:");
		for (String cor : cores) {
			System.out.println("- " + cor);
		}

	}

}
