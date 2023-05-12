package br.com.ebac.primeiro.testes;

import org.junit.Assert;
import org.junit.Test;

public class JTeste {

	@Test
	public void test() {
		String nome = "Marcello";
		Assert.assertEquals("Marcello", nome);
	}
	
	@Test
	public void notTest() {
		String nome = "Marcello";
		Assert.assertNotEquals("Marcos", nome);
	}
}
