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


	System.out.println("\nNow we'll make 6 super awesome custom cars.");

	// custom car 1
	System.out.println("\n1. A SuperCharger(myBasic):");
	// SuperCharger with default constructor
	ICar superCharged = new SuperCharger(myBasic) ;
	System.out.println(superCharged.getDescription()) ;

	// custom car 2
	System.out.println("\n2. A SuperCharger(LiftKit(myBasic)):");
	// SuperCharger with a lift kit
	ICar superLift = new SuperCharger(new LiftKit(myBasic)) ;
	System.out.println(superLift.getDescription()) ;
 
	// custom car 3
	System.out.println("\n3. A LiftKit(AirScoop(myBasic)):");
	// Lift kit with an air scoop
	ICar liftScoop = new LiftKit(new AirScoop(myBasic)) ;
	System.out.println(liftScoop.getDescription()) ;
	 
	// custom car 4
	System.out.println("\n4. A SuperCharger(AirScoop(PaintColor(myBasic))):");
	// SportWheels(LiftKit(PaintColor(new Basic)))
	ICar superScoopPainted = new SuperCharger(new AirScoop(new PaintColor(myBasic, "terracotta")));
	System.out.println(superScoopPainted.getDescription()) ;

	// custom car 5
	System.out.println("\n5. A SuperCharger(PaintColor(myBasic)):");
	ICar paintedSuper = new SuperCharger(new PaintColor(myBasic, "perriwinkle"));
	System.out.println(paintedSuper.getDescription());

	// custom car 6
	System.out.println("\n6. An AirScoop(PaintColor(myBasic)):");
	ICar paintedScoop = new AirScoop(new PaintColor(myBasic, "gatorade red"));
	System.out.println(paintedScoop.getDescription()) ;

	System.out.println("\nThe options are endless! But not really.");

	}

}
