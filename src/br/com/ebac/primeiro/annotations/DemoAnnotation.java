package br.com.ebac.primeiro.annotations;

@Tabela(valor ="Nenhum", nomes = "Primeira Tabela")
public class DemoAnnotation {
	
	@Tabela(valor = "String Teste", nomes = {"Segunda Tabela", "Terceira Tabela"})
	private String nome;

}
