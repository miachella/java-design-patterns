package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	
	private String nom;
	private int capacite;
	private List<Animal> listAnimal = new ArrayList<>();
	
	Zone(){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacite;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zone other = (Zone) obj;
		if (capacite != other.capacite)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public List<Animal> getListAnimal() {
		return listAnimal;
	}

	public void setListAnimal(List<Animal> listAnimal) {
		this.listAnimal = listAnimal;
	}

}
