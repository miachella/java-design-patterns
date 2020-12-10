package fr.diginamic.tp_grasps.factory;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

public class ReservationFactory {
	
	public static Reservation getInstance(LocalDateTime dateReservation, int nbPlaces, Client client) {
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		return reservation;
	}

}
