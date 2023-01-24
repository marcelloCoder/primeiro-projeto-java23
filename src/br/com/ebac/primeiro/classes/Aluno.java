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
	
	private Double nota1;

	private Double nota2;
	
	private Double nota3;
	
	private Double nota4;
	
	private Double resultado;
	

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
	
	
	
	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getNota4() {
		return nota4;
	}

	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}

	public void mediaGeral() {/*Método vazio para calculo da média geral da classe aluno*/
		System.out.println("Sem dados");
	}
	
	public Double getTarefaCalculoMedia() {
		return (getNota1() + getNota2() + getNota3() + getNota4())/4;
	}
	
	
	
	
	

}
