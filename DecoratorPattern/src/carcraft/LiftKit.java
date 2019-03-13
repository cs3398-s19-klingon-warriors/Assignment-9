package carcraft;
/**
 *
 * @author Abel Shinabery 
 */
public class LiftKit extends CarOptions{
   
    
    public LiftKit(ICar specialCar) {
        super(specialCar);
    }
    
    @Override
    public String getDescription(){
        return specialCar.getDescription() + addLiftKit();
    }
    
    public String addLiftKit(){
        return " with a lift kit";
    }
}