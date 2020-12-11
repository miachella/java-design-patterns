package fr.diginamic.builder;

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
		assertTrue(zooBuilder.getZoo().getListZone().contains(zone));
	}
	
	@Test 
	public void appendAnimalTest() {
		
	}

}
