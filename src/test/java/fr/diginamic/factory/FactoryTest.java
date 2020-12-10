package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryTest {
	
	@Test
	public void getInstanceTelephonePortable() {
		TelephonePortable telephone = new TelephonePortable(12.5);
		assertEquals(telephone, ObjetConnecteFactory.getInstance(ObjetConnecteEnum.TELEPHONE_PORTABLE, 12.5));
	}
	
	@Test
	public void getInstanceTablette() {
		Tablette tablette = new Tablette(12.5);
		assertEquals(tablette, ObjetConnecteFactory.getInstance(ObjetConnecteEnum.TABLETTE, 12.5));
	}

	@Test
	public void getInstanceEnceinteConnectee() {
		EnceinteConnectee enceinteConnectee = new EnceinteConnectee(12.5);
		assertEquals(enceinteConnectee, ObjetConnecteFactory.getInstance(ObjetConnecteEnum.ENCEINTE_CONNECTEE, 12.5));
	}
}
