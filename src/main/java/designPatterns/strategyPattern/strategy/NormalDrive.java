package designPatterns.strategyPattern.strategy;

public class NormalDrive implements DriverStrategy {

    @Override
    public void drive() {

        System.out.println("Normal drive strategy");
    }
}
