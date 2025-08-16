package designPatterns.strategyPattern.strategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle()
    {
        super(new NormalDrive());
    }
}
