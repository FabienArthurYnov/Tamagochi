package utilitaires;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Tama;

public class SaveAndLoad {

	public static void saveTamaPlayer(Tama player) {
		// TODO
		String to_save = "";
		to_save += "Nom:" + player.getNom() + "\n";
		to_save += "Energy:" + player.getEnergy() + "\n";
		to_save += "Force:" + player.getForce() + "\n";
		to_save += "Joie:" + player.getJoie() + "\n";
		to_save += "Faim:" + player.getFaim() + "\n";
		to_save += "Fatigue:" + player.getFatigue() + "\n";
		to_save += "Proprete:" + player.getProprete() + "\n";
		to_save += "MalusForce:" + player.getMalusforce() + "\n";
		to_save += "NbDeVictoire:" + player.getNbDeVictoire() + "\n";
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter("src/Tama/Joueur/Tama.txt"));
			b.write(to_save);
			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Tama loadTamaPlayer() {
		// TODO

		Tama player = new Tama("Username", 10, 10, 10, 0, 0, 10, 0, 0);
		return player;
	}

	public static Tama loadTamaEnemy() {
		// TODO

		return null;
	}
}
