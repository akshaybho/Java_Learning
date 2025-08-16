package designPatterns.strategyPattern.strategy;

public class SportsDrive implements DriverStrategy {

    @Override
    public void drive() {

        System.out.println("Sports drive strategy");
    }
}
