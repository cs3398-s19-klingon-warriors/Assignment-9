package carcraft;

public class SuperCharger extends CarOptions {
    
	public SuperCharger(ICar specialCar) {
		super(specialCar);
	}

	public String getDescription() {
		return specialCar.getDescription() + addSuperCharger();
	}

	private String addSuperCharger() {
		return " with a super charger";
	}
}