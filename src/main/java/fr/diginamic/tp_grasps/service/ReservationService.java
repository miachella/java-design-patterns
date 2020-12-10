package fr.diginamic.tp_grasps.service;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.DateUtils;
import fr.diginamic.tp_grasps.ReservationFactory;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

public class ReservationService {

	/** DAO permettant d'accéder à la table des clients */
	private ClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	private TypeReservationDao typeReservationDao = new TypeReservationDao();
	
	public Reservation creerReservation(String dateReservationStr, String identifiantClient, String typeReservation, int nbPlaces) {
		// 2) Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);

		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);

		// 4) Extraction de la base de données des infos concernant le type de la réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

		// 5) Création de la réservation
		Reservation reservation = ReservationFactory.getInstance(dateReservation, nbPlaces, client);

		// 6) Ajout de la réservation au client
		clientDao.ajouterReservation(client, reservation);

		// 7) Calcul du montant total de la réservation qui dépend:
		//    - du nombre de places
		//    - de la réduction qui s'applique si le client est premium ou non
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
		}
		else {
			reservation.setTotal(total);
		}
		
		return reservation;
	}
	

}
