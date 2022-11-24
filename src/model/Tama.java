package model;

import fight.MenuFight;
import utilitaires.SaveAndLoad;
import utilitaires.Utilitaires;

public class Tama {
	private String nom;
	private int energy;
	private int force;
	private int joie;
	private int faim;
	private int fatigue;
	private int proprete;
	private int malusforce;
	private int nbDeVictoire;
	private int nbDeTour;
	
	public Tama(String nom, int energy, int force, int joie, int faim, int fatigue, int proprete, int malusforce,
			int nbDeVictoire) {
		super();
		this.nom = nom;
		this.energy = energy;
		this.force = force;
		this.joie = joie;
		this.faim = faim;
		this.fatigue = fatigue;
		this.proprete = proprete;
		this.malusforce = malusforce;
		this.nbDeVictoire = nbDeVictoire;
		this.setNbDeTour(0);
	}
	
	
	public void gameLoop() {
		boolean gameOn = true;
		while (gameOn) {
			System.out.println("Tour :" + nbDeTour);
			System.out.println(this);
			boolean menuOn = true;
			while (menuOn) {
				if (energy>0) {
				} else {
					System.out.println("Votre Tamamon est à l'article de la mort !");
					menuOn = false;
					break;
				}
				System.out.println("Faites une action...");
				System.out.println("1 : Nourir");
				System.out.println("2 : Sortir");
				System.out.println("3 : Laver");
				System.out.println("4 : Carresser");
				System.out.println("5 : Combattre jusqu'a ce que mort s'ensuive");
				System.out.println("6 : Quitter");
				int playerInput = Utilitaires.askInt();
				switch (playerInput) {
				case 1:
					faim = 0;
					malusforce--; 
					System.out.println("votre Tamamon est repu");
					menuOn = false;
					break;
				case 2:
					joie = 10;
					fatigue++;
					System.out.println("Votre Tamamon est heureux");
					menuOn = false;
					break;
				case 3:
					proprete = 10;
					System.out.println("Votre Tamamon est propre");
					menuOn = false;
					break;
				case 4:
					energy =(force + joie - faim - fatigue); 
					fatigue = 0;
					System.out.println("Votre Tamamon est carressé");
					menuOn = false;
					break;
				case 5:
					MenuFight.menuFight(this);
					menuOn = false;
					break;
				case 6:
					gameOn =false;
					menuOn =false;
					break;
				default:
					System.out.println("Mauvais chiffre");
				}
			}
			if (!gameOn) {
				SaveAndLoad.saveTama(this);
				break;
			}
	
			System.out.println("Les statistiques de votre Tomamon chute");
			faim++;
			fatigue++;
			proprete--;
			nbDeTour++;
			
			
			
			int randomVariable = Utilitaires.randomInt(1,3);
			switch(randomVariable) {
			case 1: 
				faim++;
				break;
			case 2:
				fatigue++;
				break;
			case 3:
				proprete--;
				break;
			}
			
			
			force = nbDeTour/10-malusforce;
			if (faim>7) {
				joie--;fatigue++;energy--;
			}
			if (fatigue>7) {
				malusforce++;energy--;
			}
			if (proprete<3) {
				joie--;energy--;force--;
			}
			if (joie <3) {
				fatigue++;energy--;force--;
			}
			
			
			if (energy>10) {
				this.energy = 10;
			} else if (energy <0) {
				this.energy = 0;
			}
			if (force>10) {
				this.force = 10;
			} else if (force <0) {
				this.force = 0;
			}
			if (joie>10) {
				this.joie = 10;
			} else if (joie <0) {
				this.joie = 0;
			}
			if (faim>10) {
				this.faim = 10;
			} else if (faim <0) {
				this.faim = 0;
			}
			if (fatigue>10) {
				this.fatigue = 10;
			} else if (fatigue <0) {
				this.fatigue = 0;
			}
			if (proprete>10) {
				this.proprete = 10;
			} else if (proprete <0) {
				this.proprete = 0;
			}
			if (malusforce>10) {
				this.malusforce = 10;
			} else if (malusforce <0) {
				this.malusforce = 0;
			}
			
			SaveAndLoad.saveTama(this);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		String affichage = "";
		affichage += "		" + nom +"\n";
		affichage += " Energy : " + energy +"\n";
		affichage += " Force :" + force + "\n";
		affichage += " Joie :" + joie + "\n";
		affichage += " Faim :" + faim + "\n";
		affichage += " Fatigue :" + fatigue + "\n";
		affichage += " Proprete :" + proprete + "\n";
		affichage += " MalusForce :" + malusforce + "\n";

		return affichage;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getJoie() {
		return joie;
	}
	public void setJoie(int joie) {
		this.joie = joie;
	}
	public int getFaim() {
		return faim;
	}
	public void setFaim(int faim) {
		this.faim = faim;
	}
	public int getFatigue() {
		return fatigue;
	}
	public void setFatigue(int fatigue) {
		this.fatigue = fatigue;
	}
	public int getProprete() {
		return proprete;
	}
	public void setProprete(int proprete) {
		this.proprete = proprete;
	}
	public int getMalusforce() {
		return malusforce;
	}
	public void setMalusforce(int malusforce) {
		this.malusforce = malusforce;
	}
	public int getNbDeVictoire() {
		return nbDeVictoire;
	}
	public void setNbDeVictoire(int nbDeVictoire) {
		this.nbDeVictoire = nbDeVictoire;
	}


	public int getNbDeTour() {
		return nbDeTour;
	}


	public void setNbDeTour(int nbDeTour) {
		this.nbDeTour = nbDeTour;
	}
}
