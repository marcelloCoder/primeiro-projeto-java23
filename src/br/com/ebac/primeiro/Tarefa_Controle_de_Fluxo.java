package br.com.ebac.primeiro;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.ebac.primeiro.classes.Aluno;

public class Tarefa_Controle_de_Fluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		
		String r = JOptionPane.showInputDialog("Deseja adicionar notas dos alunos?");
		String resposta = r;
		
		while(resposta.equalsIgnoreCase("Sim")) {
			String nota1 = JOptionPane.showInputDialog("Insira a nota 1");
			String nota2 = JOptionPane.showInputDialog("Insira a nota 2");
			String nota3 = JOptionPane.showInputDialog("Insira a nota 3");
			String nota4 = JOptionPane.showInputDialog("Insira a nota 4");
			
			
			aluno.setNota1(Double.parseDouble(nota1));
			aluno.setNota2(Double.parseDouble(nota2));
			aluno.setNota3(Double.parseDouble(nota3));
			aluno.setNota4(Double.parseDouble(nota4));
			
			System.out.println("\nMedia das Notas = " + aluno.getTarefaCalculoMedia());
			
			if(aluno.getTarefaCalculoMedia() >= 7) {
				System.out.println("\nAprovado");
			}else if(aluno.getTarefaCalculoMedia() >= 5) {
				System.out.println("\nRecuperação");
			}else{
				System.out.println("\nReprovado");
			}
			
			resposta = JOptionPane.showInputDialog("Deseja adicionar notas dos alunos?", r);
	
			
		}
		
		JOptionPane.showMessageDialog(null, "Fim da Aplicação");
		
	}

}
