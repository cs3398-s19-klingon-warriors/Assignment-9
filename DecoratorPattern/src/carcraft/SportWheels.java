package carcraft;
/**
 * Rachel Kelmenson
 */
public class SportWheels extends CarOptions
{
	public String SportWheels ;		
    
	// default constructor
	public SportWheels(ICar specialCar)
	{
		super(specialCar);
		this.SportWheels = "wheels!" ;
	}

	public SportWheels(ICar specialCar, String wheels)
	{
		super(specialCar);
		this.SportWheels = wheels ;
	}
    
/*	
	@Override
	public String getDescription()
	{
		return specialCar.getDescription() + addSportWheels();
	}
 */

	// TEMPORARY TEST of super versus specialCar
	@Override
	public String getDescription()
	{
		return super.getDescription() + addSportWheels();
	}


	public String addSportWheels()
	{
		return " with sport wheels of type " + this.SportWheels + "(vroom vroom)";
	}
}
