package designPatterns.strategyPattern.strategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {

        super(new SportsDrive());
    }
}
