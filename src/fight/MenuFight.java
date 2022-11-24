package fight;

import model.Tama;
import utilitaires.SaveAndLoad;
import utilitaires.Utilitaires;

public class MenuFight {
	
	public static void menuFight(Tama player) {
		System.out.println("Voulez-vous lancer un combat contre un Tamamon aléatoire ou un joueur ?");
		System.out.println("1 : Importer un joueur (mettre son fichier de sauvegarde dans src/Tamamons)");
		System.out.println("2 : Un Tamamon aléatoire");
		boolean menuOn = true;
		
		Tama enemy = randomEnemy(player.getNbDeTour());
		while (menuOn) {
			int input = Utilitaires.askInt();
			switch (input) {
			case 1 :
				enemy = SaveAndLoad.loadTama();
				menuOn = false;
				break;
			case 2 :
				menuOn = false;
				break;
			default :
				System.out.println("Mauvais chiffre ! Recommencez.");
			}
		}
		
		System.out.println("Combat entre "+player.getNom()+"("+player.getNbDeVictoire()+" Vict.) et "+enemy.getNom()+"("+enemy.getNbDeVictoire()+" Vict.)");
		if (player.getForce()+Utilitaires.randomInt(1, 10) > enemy.getForce()+Utilitaires.randomInt(1, 10)) {
			player.setNbDeVictoire(player.getNbDeVictoire()+1);
			System.out.println(player.getNom()+" a gagné !");
			SaveAndLoad.saveTama(player);
		} else {
			enemy.setNbDeVictoire(enemy.getNbDeVictoire()+1);
			System.out.println(enemy.getNom()+" a gagné !");
			enemy.setNbDeVictoire(enemy.getNbDeVictoire()+1);
			if (enemy.getNom() != "Tamamon sauvage"); {
				SaveAndLoad.saveTama(enemy);
			}
		}
		
	}

	private static Tama randomEnemy(int nbDeTour) {
		// TODO Auto-generated method stub
		String name = "Tamamon sauvage";
		int energy = Utilitaires.randomInt(5, 10);
		int joie = Utilitaires.randomInt(5, 10);
		int proprete = Utilitaires.randomInt(5, 10);
		int faim = Utilitaires.randomInt(0, 5);
		int fatigue = Utilitaires.randomInt(0, 5);
		int malusForce = Utilitaires.randomInt(0, 5);
		int force = nbDeTour/10 + malusForce;
		int nbDeVictoire = 0;
		
		Tama enemy = new Tama(name, energy, force, joie, faim, fatigue, proprete, malusForce, nbDeVictoire);
		return enemy;
	}
	
}
