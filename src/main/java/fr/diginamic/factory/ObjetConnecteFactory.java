package fr.diginamic.factory;

public class ObjetConnecteFactory {
	
	public static ObjetConnecte getInstance(ObjetConnecteEnum type, double limiteVolts) {
		switch (type) {
		case TELEPHONE_PORTABLE: 
			return new TelephonePortable(limiteVolts);
		case TABLETTE:
			return new Tablette(limiteVolts);
		case ENCEINTE_CONNECTEE:
			return new EnceinteConnectee(limiteVolts);
		default:
			return null;
		}
	}

}
