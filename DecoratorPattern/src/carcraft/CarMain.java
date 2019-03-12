package carcraft;


public class CarMain {

	public static void main(String[] args) {

		ICar car = new SuperCharger(new BasicCar());
		System.out.println(car.GetDescription());

		CarOptions car1 = new AirScoop(new PaintColor(new SportWheels(new SuperCharger(new CarOptions(),"SuperCharger_type"), "SportWheels_type"), "PaintColor_type"), "AirScoop_type");

				System.out.println("Done. " + AirScoop.GetDescription());
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
