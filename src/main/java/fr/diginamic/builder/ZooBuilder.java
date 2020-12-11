package fr.diginamic.builder;

import java.util.List;

public class ZooBuilder {
	
	private Zoo zoo;
	
	public ZooBuilder(String nom) {
		this.zoo = new Zoo();
		zoo.setNom(nom);
	}
	
	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	public ZooBuilder appendZone(String nom, int capacite) {
		Zone zone = new Zone();
		zone.setNom(nom);
		zone.setCapacite(capacite);
		List<Zone> listZone = this.zoo.getListZone();
		listZone.add(zone);
		this.zoo.setListZone(listZone);
		return this;
	}
	
	public ZooBuilder appendAnimal(String nomZone, Animal animal) {
		List<Zone> listZone = this.zoo.getListZone();
		for (Zone z: listZone) {
			if (z.getNom() == nomZone) {
				List<Animal> listAnimal = z.getListAnimal();
				listAnimal.add(animal);
				z.setListAnimal(listAnimal);
			}
		}
		return this;
	}
	
	public Zoo get() {
		return this.zoo;
	}

}
