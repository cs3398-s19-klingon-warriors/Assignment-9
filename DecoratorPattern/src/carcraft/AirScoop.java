// AirScoop.java
// @Author: Sarah Gibbons
// Airscoop demonstrates the single responsibility principle; this guys options is printin a string


package carcraft;

public class AirScoop extends CarOptions {

	public AirScoop(ICar specialCar) {
        super(specialCar);
	}

	@Override
	public String getDescription() {
		return specialCar.getDescription() + addAirScoop();
	}
    
    public String addAirScoop() {
        return " with an air scoop";
    }
}
