/**
 * 
 */
package br.com.ebac.primeiro.classes;

/**
 * @author marce
 *
 */

/*Classe Aluno*/
public class Aluno {
	
	private String nome;
	
	private String endereco;
	
	private Integer idade;
	
	private Float nota;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}
	
	public void mediaGeral() {/*Método vazio para calculo da média geral da classe aluno*/
		System.out.println("Sem dados");
	}
	
	
	
	

}
