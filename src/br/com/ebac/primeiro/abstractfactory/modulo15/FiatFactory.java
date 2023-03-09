package br.com.ebac.primeiro.abstractfactory.modulo15;

public class FiatFactory implements GUIFactory{

	@Override
	public Carro createCarro() {
		// TODO Auto-generated method stub
		return new FiatCarro();
	}

}
