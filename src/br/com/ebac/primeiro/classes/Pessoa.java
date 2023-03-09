/**
 * 
 */
package br.com.ebac.primeiro.classes;

/**
 * @author marce
 *
 */
public abstract class Pessoa {
	
	private String nome;
	
	private Integer idade;
	
	private String sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @param nome
	 * @param idade
	 * @param sexo
	 */
	public Pessoa(String nome, Integer idade, String sexo) {
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	

	/**
	 * 
	 */
	public Pessoa() {
		super();
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	
	
	
	
	

}