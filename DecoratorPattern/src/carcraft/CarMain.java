package carcraft;
/*
Each team member's CarMain.java file should differ, per assignment requirements
*/

public class CarMain {

	public static void main(String[] args) {
        
        System.out.println("Starting: Creating Cars with decorator pattern\n"); 
        
        ICar custom = new SuperCharger(new SportWheels(new PaintColor(new AirScoop(new LiftKit(new BasicCar())), "red")));
        
        System.out.println(custom.getDescription());
		
        
        
//
//		CarOptions car1 = new AirScoop(new PaintColor(new SportWheels(new SuperCharger(new BasicCar()), "SportWheels_type"), "PaintColor_type"), "AirScoop_type");
//        
//        System.out.println("Done. " + car1.GetDescription());
        
		/*	Original CarMain

		System.out.println("Starting:  Creating Cars without Decorator Pattern\n");

		System.out.println("Make a Supercharged Basic Car:");
		ICar carWithSuperCharger = new CarWithSuperCharger();
		System.out.println("Done. " + carWithSuperCharger.GetDescription());

		System.out.println("\nMake a Painted Supercharged Basic Car:");
		ICar paintedCarWithSuperCharger = new PaintedCarWithSuperCharger("Blue");

		System.out.println("Done. " + paintedCarWithSuperCharger.GetDescription());

		*/
	}

}
