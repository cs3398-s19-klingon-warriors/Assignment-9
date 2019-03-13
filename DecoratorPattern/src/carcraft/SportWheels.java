package carcraft;
/**
 *
 * @author 
 */
public class SportWheels extends CarOptions{
   
    
    public SportWheels(ICar specialCar) {
        super(specialCar);
    }
    
    @Override
    public String getDescription(){
        return specialCar.getDescription() + addSportWheels();
    }
    
    public String addSportWheels(){
        return " with sport wheels";
    }
}