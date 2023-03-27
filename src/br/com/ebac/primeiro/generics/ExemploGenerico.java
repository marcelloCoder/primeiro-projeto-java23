package br.com.ebac.primeiro.generics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.ebac.primeiro.generics.classes.Empresa;
import br.com.ebac.primeiro.generics.classes.Funcionario;
import br.com.ebac.primeiro.generics.classes.Fundador;

public class ExemploGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		lista.add("è uma string");
		lista.add("è uma string 2");
		lista.add("è uma string 4");
		imprimirObject(lista); 
		imprimirString(lista);
		
		List<Integer> listaInteger = new ArrayList<>();
		listaInteger.add(122);
		imprimirInteger(listaInteger); 
		
		String primeroSt = imprimirPrimeiro(lista);
		System.out.println(primeroSt);
		
		System.out.println(imprimirPrimeiro(lista));
		
		
		GenericEntry<String, Long> entry = new GenericEntry<String, Long>("Teste", 10L);

		System.out.println(entry);
		
		GenericEntry<Long, Integer> entry1 = new GenericEntry<Long, Integer>(111L, 10);

		System.out.println(entry1);
		
		List<Empresa> empresa = new ArrayList<>();
		
		
		empresa.add(new Funcionario());
		empresa.add(new Fundador());
		imprimeEmpresa(empresa);

	}
	
	private static/*static apenas para o metodo main*/ void imprimirInteger(List<Integer> listaInteger) {
		for(Integer  abc : listaInteger) {
			System.out.println(abc);
		}
		
	}
	public static void imprimeEmpresa(List<? extends Empresa> lista) {
		for(Object emp : lista) {
			System.out.println("Adicionando empresa classe " + emp);
		}
		
	}

	public static void imprimirString(List<?> lista) {
		for(Object  str : lista) {
			System.out.println("Qualquer coisa " + str);
		}
	}
	
	public static <E> void imprimirObject(List<E> lista) {
		for(E st : lista) {
			System.out.println(st);
		}
	}
	
	public static <F> F imprimirPrimeiro(List<F> lista) {
		return lista.get(1);
	}

}
