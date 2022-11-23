package main;

import model.Tama;
import utilitaires.SaveAndLoad;
import utilitaires.Utilitaires;

public class Main {
	public static void main(String args[]) {
		System.out.println("////TAMAMON\\\\\n");
		System.out.println("(Toute ressemblance avec des marques à succès n'est que coïncidence)");
		System.out.println("1 : Charger une sauvegarde");
		System.out.println("2 : Créé une nouvelle partie");

		Tama player = new Tama("Username", 10, 10, 10, 0, 0, 10, 0, 0);
		
		
		boolean menuOn = true;
		while (menuOn) {
			int input = Utilitaires.askInt();
			switch (input) {
			case 1:
				player = SaveAndLoad.loadTamaPlayer();
				System.out.println("Tamamon chargé !");
				menuOn = false;
				break;
			case 2:
				System.out.println("Quel sera son nom ?");
				String nom = Utilitaires.askString();
				player = new Tama(nom, 10, 10, 10, 0, 0, 10, 0, 0);
				System.out.println("Tamamon créé !");
				menuOn = false;
				break;
			default:
				System.out.println("Mauvais chiffre ! Recommencez.");
				
			}
		}
		
		player.gameLoop();
		System.out.println("A bientôt, et n'oubliez pas votre Tama !");
	}
}
