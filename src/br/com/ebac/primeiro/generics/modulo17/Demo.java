package br.com.ebac.primeiro.generics.modulo17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Carro> carro = new ArrayList<>();
		List<Hyundai> hyundai = new ArrayList<>();
		List<Fiat> fiat = new ArrayList<>();
		
		
		carro.add(new Hyundai(12, "Uma string normal"));
		imprimeCarro(carro);
		contarCarro(carro);
		imprimeHyundai(hyundai);
		orderList(hyundai);
		
	}

	private static int contarCarro(List<?> qualquerTipo) {
		return qualquerTipo.size();
		
	}

	private static void imprimeCarro(List<? extends Carro> carro) {
		// TODO Auto-generated method stub
		for(Object car : carro) {
			System.out.println("Addd carro " + car);
		}
			
	}
	private static void imprimeHyundai(List<? super Hyundai> hyundai) {
		hyundai.add(new Hyundai("carro hyundai", "carro hyundai"));
		System.out.println("Adicionando Hyundai " + hyundai);
	}

	private static void orderList(List<? extends Comparable> lista) {
		Collections.sort(lista);
		System.out.println(lista);
	}
	
}
