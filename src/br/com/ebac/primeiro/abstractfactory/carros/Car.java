package br.com.ebac.primeiro.abstractfactory.carros;

public abstract class Car {
	
	private int horsePower;
	private String fuelSource;
	private String color;
	
	public Car(int horsePower, String fuelSource, String color) {
		super();
		this.horsePower = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}
	
	public void startEngine() {
		System.out.println(getClass().getSimpleName());
		System.out.println("The engine has been started, ready to utilize " + horsePower + " by engine power");
	}
	public void clean() {
		System.out.println("Cleaned " + color.toLowerCase() + " color shines");
	}
	public void mechanicCheck() {
		System.out.println("Car checked");
	}
	public void fuelCar() {
		System.out.println("Filled with " + fuelSource.toLowerCase());
	}
	
	

}
