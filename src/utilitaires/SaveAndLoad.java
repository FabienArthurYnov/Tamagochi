package utilitaires;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.Tama;

public class SaveAndLoad {

	public static void saveTama(Tama player) {
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
		to_save += "NbDeTour:" + player.getNbDeTour() + "\n";
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter("src/Tamamons/"+player.getNom()+".txt"));
			b.write(to_save);
			b.close();
			System.out.println(player.getNom() +" sauvegardé !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static Tama loadTama() {
		Tama player = new Tama("Username", 10, 10, 10, 0, 0, 10, 0, 0);
		
		System.out.println("Quel est le nom du Tamamon ?");
		String nom = Utilitaires.askString();
		
		
		
		try {
			BufferedReader b = new BufferedReader(new FileReader("src/Tamamons/"+nom+".txt"));
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
			currentLine = b.readLine();
			player.setNbDeTour(Integer.parseInt(currentLine.split(":")[1]));

			System.out.println("Tamamon chargé !");
			
		} catch (FileNotFoundException e) {
			System.out.println("Il n'existe pas de Tamamon à ce nom ! Un nouveau Tama viens d'être créé.");
			player = new Tama(nom, 10, 10, 10, 0, 0, 10, 0, 0);
		} catch (IOException e) {
			System.out.println("Le Tamamon n'est pas complet ou n'as pas un format valide. (Peut-être manque-t-il son nombre de victoire et de tour ?");
		}

		return player;
	}
}
