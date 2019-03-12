// AirScoop.java
// @Author: Sarah Gibbons
// Airscoop demonstrates the single responsibility principle; this guys options is printin a string 
package carcraft;

public class AirScoop extends CarOptions() {

	public String my_scoop;

	public AirScoop(String scoop_foo)
	{
		System.out.println("AirScoop Constructor... scoops the air?");

    this.scoop = scoop_foo;
	}

	@Override

	public String getDescription()
	{
		return " with " + this.scoop + " scoopin' ";
	}
