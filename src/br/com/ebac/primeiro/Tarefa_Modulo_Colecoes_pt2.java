/**
 * 
 */
package br.com.ebac.primeiro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.com.ebac.primeiro.classes.Aluno;
import br.com.ebac.primeiro.classes.Pessoa;
import br.com.ebac.primeiro.classes.PessoaJuridica;

/**
 * @author marce
 *
 */
public class Tarefa_Modulo_Colecoes_pt2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Map<String, String> lista = new HashMap<>(); List<String> nome = new
		 * ArrayList<String>(); List<String> sexo = new ArrayList<String>();
		 * nome.add(JOptionPane.showInputDialog("Digite o seu Nome:"));
		 * sexo.add(JOptionPane.showInputDialog("Digite o seu Sexo:"));
		 * System.out.println(lista);
		 */

		/*
		 * lista.keySet().stream().forEach(System.out::println);
		 * lista.values().stream().forEach(System.out::println);
		 * 
		 * Iterator<Map.Entry<String, String>> it = lista.entrySet().iterator();
		 * while(it.hasNext()) { Map.Entry<String, String> entry1 = it.next();
		 * System.out.println("Chave: " + entry1.getKey()); System.out.println("Valor: "
		 * + entry1.getValue()); }
		 */

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		List<String> cres = new LinkedList<String>();
		List<String> cres1 = new LinkedList<String>();
		PessoaJuridica pessoas1 = new PessoaJuridica();

		String r = JOptionPane.showInputDialog("Deseja adicionar nomes?");
		String resposta = r;

		/*while (resposta.equalsIgnoreCase("Sim")) {
			String nome = JOptionPane.showInputDialog("Digite o seu nome");
			String sexo = JOptionPane.showInputDialog("Digite o seu sexo");
			
		
		
			pessoas1.setNome(nome);
			pessoas1.setSexo(sexo);
			pessoas.add(pessoas1);
	
			
			Pessoa[] arrayPessoa = new Pessoa[1];
			arrayPessoa[0] = pessoas1;
			
		
			
			for (int pos = 0; pos < arrayPessoa.length; pos++) {
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Nome : " + arrayPessoa[pos].getNome() + " \nSexo: " + arrayPessoa[pos].getSexo());
				System.out.println("----------------------------------------------------------------------");
			}
			
				
		
			resposta = JOptionPane.showInputDialog("Deseja adicionar nomes?", r);
		
			
		}*/
		
		
		
		while (resposta.equalsIgnoreCase("Sim")) {
			cres.add(JOptionPane.showInputDialog("Digite o seu nome"));
			cres1.add(JOptionPane.showInputDialog("Digite o seu sexo"));
			Collections.sort(cres);
			resposta = JOptionPane.showInputDialog("Deseja adicionar nomes?", r);
			
		
		}
		
		
		System.out.println("\n Nomes: " + cres + cres1 + "\n");
	
		for(String x: cres) {
			List<String> stringList = Pattern.compile(",").splitAsStream(x).collect(Collectors.toList());
			stringList.forEach(s -> System.out.println(s));
			
		}
		
		
		
	
		
		
		JOptionPane.showMessageDialog(null, "Fim da Aplicação");
		
	

	}
	
	

}
