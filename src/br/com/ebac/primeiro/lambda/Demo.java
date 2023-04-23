package br.com.ebac.primeiro.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Objeto", 100.09));
		list.add(new Produto("Mesa", 450.87));
		list.add(new Produto("Computador", 334.61));
		
		Comparator<Produto> comp = (p1, p2) -> {
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

		};
				
				
		//list.sort(new MyComparator());
		
		list.sort(comp);
		
		for(Produto p : list) {
			System.out.println(p);
		}


	}

}
