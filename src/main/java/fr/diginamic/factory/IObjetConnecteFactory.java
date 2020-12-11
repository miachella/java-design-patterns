package fr.diginamic.factory;

public interface IObjetConnecteFactory {

	public ObjetConnecte getInstance(ObjetConnecteEnum type, double limiteVolts);
	
}
