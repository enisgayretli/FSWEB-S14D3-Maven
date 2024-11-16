package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders){
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter(){
        return this.avgKmPerLiter;
    }

    public int getBatterySize(){
        return this.batterySize;

    }

    public int getCylinders(){
        return this.cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "HybridCar's engine is starting";
    }

    @Override
    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "HybridCar is being drove";
    }
}
