package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcul {

	@Test
	void testSomme() {
		assertEquals(Calcul.somme(2, 5), 7);
	}
	
	@Test
	void testProduit() {
		assertEquals(Calcul.produit(2, 5), 10);
	}

}
