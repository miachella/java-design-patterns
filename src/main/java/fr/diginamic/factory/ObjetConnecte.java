package fr.diginamic.factory;

public class ObjetConnecte {
	
	protected double limiteVolts;

	public ObjetConnecte(double limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(limiteVolts);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ObjetConnecte other = (ObjetConnecte) obj;
		if (Double.doubleToLongBits(limiteVolts) != Double.doubleToLongBits(other.limiteVolts))
			return false;
		return true;
	}

}
