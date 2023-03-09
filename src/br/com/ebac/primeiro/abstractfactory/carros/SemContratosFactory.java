package br.com.ebac.primeiro.abstractfactory.carros;

public class SemContratosFactory extends Factory{

	@Override
	Car retrieveCar(String requestGrade) {
		if("A".equals(requestGrade)) {
			return new Fusca(100, "CHEIO", "AZUL");
		}
		else {
			return null;
		}
	}

}
