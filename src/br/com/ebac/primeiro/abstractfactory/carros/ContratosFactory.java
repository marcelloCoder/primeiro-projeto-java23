package br.com.ebac.primeiro.abstractfactory.carros;

public class ContratosFactory extends Factory{

	@Override
	Car retrieveCar(String requestGrade) {
		if("A".equals(requestGrade)) {
			return new CorolaCar(40, "METADE", "VERDE");
		}
		else {
			return null;
		}
	}

}
