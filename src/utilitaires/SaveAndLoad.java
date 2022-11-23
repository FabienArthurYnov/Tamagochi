package utilitaires;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.Tama;

public class SaveAndLoad {

	public static void saveTamaPlayer(Tama player) {
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
		Tama player = new Tama("Username", 10, 10, 10, 0, 0, 10, 0, 0);
		
		try {
			BufferedReader b = new BufferedReader(new FileReader("src/Tama/Joueur/Tama.txt"));
			String currentLine = b.readLine();
			player.setNom(currentLine.split(":")[1]);
			currentLine = b.readLine();
			player.setEnergy(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setForce(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setJoie(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setFaim(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setFatigue(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setProprete(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setMalusforce(Integer.parseInt(currentLine.split(":")[1]));
			currentLine = b.readLine();
			player.setNbDeVictoire(Integer.parseInt(currentLine.split(":")[1]));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return player;
	}

	public static Tama loadTamaEnemy() {
		// TODO

		return null;
	}
}
