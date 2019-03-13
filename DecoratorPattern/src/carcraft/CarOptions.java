package carcraft;

abstract class CarOptions implements ICar {

	protected ICar specialCar;

	public CarOptions(ICar specialCar) {

		this.specialCar = specialCar;
	}

	public String GetDescription() {

		return specialCar.getDescription();
	}
}