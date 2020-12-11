package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class FactoryTest {
	
	private IObjetConnecteFactory factory = new ObjetConnecteFactory();
	
	@Test
	public void getInstanceTelephonePortable() {
		TelephonePortable telephone = new TelephonePortable(12.5);
		assertEquals(telephone, factory.getInstance(ObjetConnecteEnum.TELEPHONE_PORTABLE, 12.5));
	}
	
	@Test
	public void getInstanceTablette() {
		Tablette tablette = new Tablette(12.5);
		assertEquals(tablette, factory.getInstance(ObjetConnecteEnum.TABLETTE, 12.5));
	}

	@Test
	public void getInstanceEnceinteConnectee() {
		EnceinteConnectee enceinteConnectee = new EnceinteConnectee(12.5);
		assertEquals(enceinteConnectee, factory.getInstance(ObjetConnecteEnum.ENCEINTE_CONNECTEE, 12.5));
	}
	
	@Test
	public void getInstanceNull() {
		assertNull(factory.getInstance(null, 12.5));
	}
}
