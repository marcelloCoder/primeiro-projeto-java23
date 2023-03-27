package br.com.ebac.primeiro.generics.classes;

public class Funcionario implements Empresa{
	
	String nome;
	
	@Override
	public String toString() {
		return "Fundador [nome=" + nome + "]";
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
