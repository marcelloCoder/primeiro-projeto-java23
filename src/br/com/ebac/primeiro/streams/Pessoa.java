package br.com.ebac.primeiro.streams;

import java.util.List;

public class Pessoa {
	
	private String nome;
	
	private String genero;
	
	

	public Pessoa(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public List<Pessoa> populaPessoa(){
		
		Pessoa pessoa1 = new Pessoa("Marcos", "Masculino");
		Pessoa pessoa2 = new Pessoa("Fernanda", "Feminino");
		Pessoa pessoa3 = new Pessoa("Hugo", "Masculino");
		Pessoa pessoa4 = new Pessoa("Leonardo", "Masculino");
		
		return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
	}

	@Override
	public String toString() {
		return "Pessoa [" + (nome != null ? "nome=" + nome + ", " : "") + (genero != null ? "genero=" + genero : "")
				+ "]";
	}

	
	
	

}
