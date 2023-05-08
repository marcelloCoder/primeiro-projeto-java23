package br.com.ebac.primeiro.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

}
