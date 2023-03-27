package br.com.ebac.primeiro.generics.classes;

public class Fundador implements Empresa{
	
	String nome;
	
	

	@Override
	public String toString() {
		return "Fundador [nome=" + nome + "]";
	}

	public Fundador() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
