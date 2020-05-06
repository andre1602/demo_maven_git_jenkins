package com.intiformation.jenkins.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest {

	@Test
	public void testAdd() {
		Calculatrice c = new Calculatrice();
		assertEquals("Est ce que l'addition est correcte", 10, c.add(5, 5));
	}

	@Test
	public void testMul() {
		Calculatrice c = new Calculatrice();
		assertEquals("Est ce que la multiplication est correcte", 10, c.mul(5, 2));
	}

}
