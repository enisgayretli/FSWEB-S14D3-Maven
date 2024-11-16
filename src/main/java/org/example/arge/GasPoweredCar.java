package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders){
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter(){
        return this.avgKmPerLiter;
    }

    public int getCylinders(){
        return this.cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "GasPoweredCar's engine is starting";
    }

    @Override
    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "GasPoweredCar is being drove";
    }
}
