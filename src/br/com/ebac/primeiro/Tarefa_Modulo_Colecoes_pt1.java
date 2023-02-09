package br.com.ebac.primeiro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import br.com.ebac.primeiro.classes.Pessoa;

public class Tarefa_Modulo_Colecoes_pt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("-------------------------------------------------");
		 * List<Pessoa> pessoa = new ArrayList<Pessoa>(); Pessoa a = new
		 * Pessoa("Marcello", 21 , "Masculino"); Pessoa b = new Pessoa("Ana", 21 ,
		 * "Feminino"); pessoa.add(a); pessoa.add(b); System.out.println(pessoa.size());
		 * 
		 * for(Pessoa x : pessoa) { System.out.println(pessoa); }
		 */

		String r = JOptionPane.showInputDialog("Adicionar nomes?");
		String resposta = r;

		while (resposta.equalsIgnoreCase("Sim")) {

			List<String> list = new ArrayList<String>();
			List<String> list1 = new ArrayList<String>();
			list1.add(JOptionPane.showInputDialog("Digite o seu Nome:"));
			list.add(JOptionPane.showInputDialog("Digite o seu Sexo:"));
			List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

			for (String x : result) {
				System.out.println("-----------------Pessoas do sexo Masculino-----------------");

				System.out.println("\nNome: " + list1);
				System.out.println("\nSexo: " + result);
				System.out.println("\n-----------------------------------------------------------");
			}

			List<String> result1 = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());

			for (String x : result1) {
				System.out.println("-----------------Pessoas do sexo Feminino----------------");

				System.out.println("\nNome: " + list1);
				System.out.println("\nSexo: " + result1);
				System.out.println("\n-----------------------------------------------------------");
			}

			resposta = JOptionPane.showInputDialog("Deseja adicionar notas dos alunos?", r);
		}

		JOptionPane.showMessageDialog(null, "Fim da Aplicação");

	}

}
