package fr.diginamic.composite;

public class Employe implements IElement {
	
	private double salaire;
	private String nom; 
	private String prenom;
	
	public Employe(double salaire, String nom, String prenom) {
		super();
		this.salaire = salaire;
		this.setNom(nom);
		this.setPrenom(prenom);
	}
	
	@Override
	public double calculerSalaire () {
		return salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
