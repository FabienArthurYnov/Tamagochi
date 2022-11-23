package model;

public class Tama {
	private String nom;
	private int energy;
	private int force;
	private int joie;
	private int faim;
	private int fatigue;
	private int proprete;
	private int malusforce;
	private int nbrvictoire;
	
	public Tama(String nom, int energy, int force, int joie, int faim, int fatigue, int proprete, int malusforce,
			int nbrvictoire) {
		super();
		this.nom = nom;
		this.energy = energy;
		this.force = force;
		this.joie = joie;
		this.faim = faim;
		this.fatigue = fatigue;
		this.proprete = proprete;
		this.malusforce = malusforce;
		this.nbrvictoire = nbrvictoire;
	}
	
	
	public void gameLoop() {
		boolean gameOn = true;
		while (gameOn) {
			// TODO Matt, créé la partie un et les stats qui évoluent avec des tours, l'affichage
			
			gameOn = false;
		}
		
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
	public int getNbrvictoire() {
		return nbrvictoire;
	}
	public void setNbrvictoire(int nbrvictoire) {
		this.nbrvictoire = nbrvictoire;
	}
}
