package utilitaires;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilitaires {

	
	public static String askString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static int askInt() {
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Vous devez taper un chiffre !");
			return askInt();
		}
	}
	
	public static int randomInt(int min, int max) {
		Random rn = new Random();
		return rn.nextInt(max-min+1) + min;
	}
	
	
}
