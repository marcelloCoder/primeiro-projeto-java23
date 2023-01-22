/**
 * 
 */
package br.com.ebac.primeiro;

import br.com.ebac.primeiro.classes.Aluno;

/**
 * @author marce
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		
		/*String ambiente = args[0];
		
		
		if (ambiente.equals("Dev")) {
			System.out.println("Dev");
		}*/
		
		Aluno aluno = new Aluno();
		System.out.println("\nTarefa Calculo Media: " + aluno.getTarefaCalculoMedia());

	}

}
