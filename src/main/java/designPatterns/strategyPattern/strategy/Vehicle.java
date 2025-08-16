package designPatterns.strategyPattern.strategy;

public class Vehicle {

    DriverStrategy driverStrategy;

    public Vehicle(DriverStrategy driveObj)
    {
        this.driverStrategy = driveObj;
    }

    public void drive()
    {
        driverStrategy.drive();
    }
}
