package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "the car is being drove";
    }

    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car engine is running";
    }
}
