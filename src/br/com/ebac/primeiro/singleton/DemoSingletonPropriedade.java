package br.com.ebac.primeiro.singleton;

public class DemoSingletonPropriedade {

	public static void main(String args[]) {
		SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
		System.out.println(singleton.getValue());
	}
}
