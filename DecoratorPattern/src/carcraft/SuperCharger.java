package carcraft;

public class SuperCharger extends CarOptions {
	
	public SuperCharger(ICar specialCar) {
		super(specialCar);
	}

	public String GetDescription() {
		return specialCar.GetDescription() + addSuperCharger();
	}

	private String addSuperCharger() {
		return " with a super charger";
	}
}