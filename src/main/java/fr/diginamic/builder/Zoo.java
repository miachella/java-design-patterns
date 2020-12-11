package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private String nom;
	private List<Zone> listZone = new ArrayList<>();
	
	Zoo(){
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Zone> getListZone() {
		return listZone;
	}

	public void setListZone(List<Zone> listZone) {
		this.listZone = listZone;
	}

}
