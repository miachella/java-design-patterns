package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
	
	private List<IElement> list = new ArrayList<IElement>();

	public List<IElement> getList() {
		return list;
	}

	public void setList(List<IElement> list) {
		this.list = list;
	}

	public Service(List<IElement> list) {
		super();
		this.list = list;
	}

	@Override
	public double calculerSalaire() {
		double salaire = 0;
		for (IElement elt: list) {
			salaire = salaire + elt.calculerSalaire();
		}
		return salaire;
	}

}
