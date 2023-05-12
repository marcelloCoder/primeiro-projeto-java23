package br.com.ebac.primeiro.testes;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("--Todas as pessoas--\n");
		
		List<Pessoa> pessoa = new Pessoa().populaPessoa();
		
		List<Pessoa> imprime = pessoa.stream().toList();
		
		imprime.forEach(System.out::println);
		
		System.out.println("\n********************************\n");
		
		System.out.println("--Pessoas com sexo Feminino--\n");
		
		List<Pessoa> imprimeGenero = pessoa.stream().
				filter(lista -> lista.getGenero().
						equals("Feminino")).collect(Collectors.toList());
		
		imprimeGenero.forEach(System.out::println);
	}
	
	@Test
	public void test() {
	
		Pessoa pessoa1 = new Pessoa("João", "Masculino");
	    Pessoa pessoa2 = new Pessoa("Maria", "Feminino");
	    Pessoa pessoa3 = new Pessoa("Ana", "Feminino");
		
		List<Pessoa> listaF = new ArrayList<>();
		
		List<Pessoa> listaP = new ArrayList<>();
		listaP.add(pessoa1);
		listaP.add(pessoa2);
		listaP.add(pessoa3);
		
		

		
		 for(Pessoa pessoa : listaP) {
	            if(pessoa.getGenero().equals("Feminino")) {
	                listaF.add(pessoa);
	            }
	        }

	        assertFalse(listaF.isEmpty());
	        assertEquals(2, listaF.size());
	        assertTrue(listaF.contains(pessoa2));
	        assertTrue(listaF.contains(pessoa3));

		
	
	}
	
	//@Test
	/*public void test2() {
		List<Pessoa> pessoa = new Pessoa().populaPessoa();
		
		List<Pessoa> listaF = new ArrayList<>();
		 for(Pessoa pessoa1 : pessoa) {
	            if(pessoa1.getGenero().equals("Feminino")) {
	                listaF.add(pessoa1);
	            }
	        }
		 assertFalse(listaF.isEmpty());
	     assertEquals(1, listaF.size());
	     assertTrue(listaF.contains(pessoa));
	    
	}*/

}
