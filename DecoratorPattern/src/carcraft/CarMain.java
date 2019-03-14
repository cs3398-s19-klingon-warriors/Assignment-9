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
	System.out.println("Let's make a basic car first.\n") ;
	ICar myBasic = new BasicCar();
	System.out.println(myBasic.getDescription());


	System.out.println("Now let's make types out of this existing basic car.\n");

	// custom car 1
	System.out.println("We'll do SportWheels(Basic)) with default sport constructor.\n");
	// SportWheels with default constructor
	ICar sporty = new SportWheels(myBasic()) ;
	System.out.println(sporty.getDescription()) ;


	// custom car 2
	System.out.println("Now SportWheels(Basic)) with parameterized sport constructor.\n");
	// SportWheels with param constructor
	ICar sportyExtra = new SportWheels(myBasic(), "spinning rims and slick as heck") ;
	System.out.println(sportyExtra.getDescription()) ;
 
	// custom car 3
	System.out.println("Now SuperCharger(AirScoop(Basic))\n");
	// SuperCharger(AirScoop)
	ICar chargeScoop = new SuperCharger(new AirScoop(myBasic())) ;
	System.out.println(chargeScoop.getDescription()) ;
 
	
	System.out.println("Now let's directly make custom cars without using the basic from earlier.\n");
	 
	// custom car 4
	System.out.println("We'll do SportWheels(LiftKit(PaintColor)).\n");
	// SportWheels(LiftKit(PaintColor(new Basic)))
	ICar fancy = new SportWheels(new LiftKit(new PaintColor(new BasicCar(), "electric blue\n")));
	System.out.println(fancy.getDescription()) ;

	// custom car 5
	System.out.println("We'll do LiftKit(SuperCharger).\n");
	ICar highCharge = new LiftKit(new SuperCharger(new BasicCar()))
	System.out.println(highCharge.getDescription()) ;

	// custom car 6
	System.out.println("Now let's make a car with all 5 decorator classes!\n");
	ICar ultimate = new AirScoop(new SuperCharger(new LiftKit(new PaintColor(new SportWheels(new BasicCar(), "snow tires"), "fire engine red")))) ;
	System.out.println(ultimate.getDescription()) ;



        
//	ICar custom = new SuperCharger(new SportWheels(new PaintColor(new AirScoop(new LiftKit(new BasicCar())), "red")));
        
//	System.out.println(custom.getDescription());
	}

}
