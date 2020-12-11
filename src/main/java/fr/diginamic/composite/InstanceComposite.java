package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class InstanceComposite {

	public static void main(String[] args) {
		IElement e1 = new Employe(15, "Durand", "Bertrand");
		IElement e2 = new Employe(15, "Durand", "Bertrand");
		IElement e3 = new Employe(15, "Durand", "Bertrand");
		IElement e4 = new Employe(15, "Durand", "Bertrand");
		List<IElement> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		IElement s1 = new Service(l1);
		List<IElement> l2 = new ArrayList<>();
		l2.add(s1);
		l2.add(e3);
		l2.add(e4);
		Service s2 = new Service(l2);
		
		System.out.println("Liste de nb d'instance dans service 2 : " + s2.getList().size() + " instances");
		System.out.println(s2.calculerSalaire() + " de salaire (normalement 60) ");
	}

}
