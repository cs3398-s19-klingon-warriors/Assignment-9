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
    public String getDescription(){
        return specialCar.getDescription() + paintCar(); 
    }
    
    public String paintCar() {
        return " that is painted " + this.color;
    }
}
