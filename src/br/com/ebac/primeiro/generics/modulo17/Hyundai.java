package br.com.ebac.primeiro.generics.modulo17;

public class Hyundai<T, E> extends Carro<E, T> implements Comparable<T>{

	public Hyundai(E nome, T marca) {
		super(nome, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
