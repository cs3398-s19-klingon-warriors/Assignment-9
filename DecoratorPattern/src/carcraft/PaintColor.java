package carcraft;
/**
 *
 * @author Serena Gutierrez
 */
public class PaintColor extends CarOptions{
   
    public String color;

    public PaintColor(ICar specialCar, String color) {
        super(specialCar);
        this.color = color;
    }
    
    @Override
    public String GetDescription(){
        return "Painting car " +this.color+"!";
    }
   
 
}
