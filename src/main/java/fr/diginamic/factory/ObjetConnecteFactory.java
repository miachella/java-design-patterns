package fr.diginamic.factory;

public class ObjetConnecteFactory implements IObjetConnecteFactory {
	
	public ObjetConnecte getInstance(ObjetConnecteEnum type, double limiteVolts) {
		if(type == null) {
			return null;
		}
		
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
