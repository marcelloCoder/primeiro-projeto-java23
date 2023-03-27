package br.com.ebac.primeiro.generics.modulo17;

public abstract class Carro<E, T> {
	
	private E nome;
	
	private T marca;

	public E getNome() {
		return nome;
	}

	public void setNome(E nome) {
		this.nome = nome;
	}

	public T getMarca() {
		return marca;
	}

	public void setMarca(T marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}

	
	
	

}
