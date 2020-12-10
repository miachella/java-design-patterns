package fr.diginamic.tp_grasps.utils;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class CalculUtils {
	
	// 7) Calcul du montant total de la réservation qui dépend:
				//    - du nombre de places
				//    - de la réduction qui s'applique si le client est premium ou non
	public static void montantReservation(Reservation reservation, Client client, int nbPlaces, TypeReservation type) {
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
		}
		else {
			reservation.setTotal(total);
		}
	}
			

}
