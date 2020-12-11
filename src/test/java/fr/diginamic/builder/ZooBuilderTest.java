package fr.diginamic.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ZooBuilderTest {
	
	private ZooBuilder zooBuilder = new ZooBuilder("mon zoo");
	
	@Test
	public void appendZoneTest() {
		Zone zone = new Zone();
		zone.setCapacite(8);
		zone.setNom("ma Zone");
		zooBuilder.appendZone("ma Zone", 8);
		Zoo zoo = zooBuilder.get();
		assertTrue(zoo.getListZone().contains(zone));
		assertEquals(1, zoo.getListZone().size());
	}
	
	@Test 
	public void appendAnimalTest() {
		Animal animal = new Dauphin();
		animal.setNom("Flipper");
		Zoo zoo = zooBuilder.appendZone("ma Zone", 3).appendAnimal("ma Zone", animal).get();
		assertEquals(1, zoo.getListZone().get(0).getListAnimal().size());
		assertEquals("Flipper", zoo.getListZone().get(0).getListAnimal().get(0).getNom());
		assertEquals(Dauphin.class, zoo.getListZone().get(0).getListAnimal().get(0).getClass());
	}

}
