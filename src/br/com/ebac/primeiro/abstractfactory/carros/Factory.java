package br.com.ebac.primeiro.abstractfactory.carros;

public abstract class Factory {
	
	public Car create(String requesGrade) {
		Car car = retrieveCar(requesGrade);
		car = prepareCar(car);
		return car;
	}
	
	private Car prepareCar(Car car) {
		car.clean();
		car.mechanicCheck();
		car.fuelCar();
		return car;
	}
	
	abstract Car retrieveCar(String requestGrade);

}
