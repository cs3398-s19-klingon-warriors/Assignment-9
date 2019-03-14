# Assignment-9

**Talon**: SuperCharger.java, CarOptions.java <br>
**Serena**: PaintColor.java<br>
**Sarah**: AirScoop.java<br>
**Rachel**: SportWheels.java<br>
**Abel**: LiftKit.java

Successful build and run: 3/13, 10;09pm, with Talon CarMain version.

**SOLID Principles Explained:**
1. Our code follows the Single Responsibility Principle as each class is responsible for one custom aspect of a car being built. These classes can be added or removed and will have no effect on the performance of the other classes.
2. Our code adheres to the Open-Close Principle as each new custom option can be added as a new class and the creator does not need to edit any additional files to implement it.
3. Our code adheres to the Liskov's Substitution Principle as each new custom options adds to the BasicCar description, but does not change the functionality of BasicCar.
4. Our code adheres to Interface Segregation as our ICar class is seperate and is used as the only interface necessary to perform custom car creating.
5. Our code adheres to Dependency Inversion Principles as our custom option classes use the interface as an abstraction layer before being used by BasicCar.
