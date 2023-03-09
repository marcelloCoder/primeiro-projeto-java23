package br.com.ebac.primeiro.abstractfactory.modulo15;

public class App {
	
	private Carro carro;
	
	public App(GUIFactory factory) {
		carro = factory.createCarro();
	}
	
	public void paint() {
		carro.paint();
	}

}
