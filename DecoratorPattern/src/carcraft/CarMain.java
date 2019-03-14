package carcraft;
/*
   Rachel Kelmenson

   Make 6 custom cars
*/

public class CarMain {

	public static void main(String[] args)
	{
        
	System.out.println("Starting: Creating Cars with decorator pattern\n"); 


	// basic car
	System.out.println("Let's make a basic car first.") ;
	ICar myBasic = new BasicCar();
	System.out.println(myBasic.getDescription());


	System.out.println("\nNow let's make types out of this existing basic car.");

	// custom car 1
	System.out.println("\nWe'll do SportWheels(Basic)) with default sport constructor.");
	// SportWheels with default constructor
	ICar sporty = new SportWheels(myBasic) ;
	System.out.println(sporty.getDescription()) ;


	// custom car 2
	System.out.println("\nNow SportWheels(Basic)) with parameterized sport constructor.");
	// SportWheels with param constructor
	ICar sportyExtra = new SportWheels(myBasic, "spinning rims and slick as heck") ;
	System.out.println(sportyExtra.getDescription()) ;
 
	// custom car 3
	System.out.println("\nNow SuperCharger(AirScoop(Basic))");
	// SuperCharger(AirScoop)
	ICar chargeScoop = new SuperCharger(new AirScoop(myBasic)) ;
	System.out.println(chargeScoop.getDescription()) ;
 
	
	System.out.println("\nNow let's directly make custom cars without using the basic from earlier.");
	 
	// custom car 4
	System.out.println("\nWe'll do SportWheels(LiftKit(PaintColor)).");
	// SportWheels(LiftKit(PaintColor(new Basic)))
	ICar fancy = new SportWheels(new LiftKit(new PaintColor(new BasicCar(), "electric blue")));
	System.out.println(fancy.getDescription()) ;

	// custom car 5
	System.out.println("\nWe'll do LiftKit(SuperCharger).");
	ICar highCharge = new LiftKit(new SuperCharger(new BasicCar())) ;
	System.out.println(highCharge.getDescription()) ;

	// custom car 6
	System.out.println("\nNow let's make a car with all 5 decorator classes!");
	ICar ultimate = new AirScoop(new SuperCharger(new LiftKit(new PaintColor(new SportWheels(new BasicCar(), "snow tires"), "fire engine red")))) ;
	System.out.println(ultimate.getDescription()) ;

	System.out.println("\nSo many good cars! Goodbye!");

	}

}
