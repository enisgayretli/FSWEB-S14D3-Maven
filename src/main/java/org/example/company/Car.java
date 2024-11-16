package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;// cylinders == cylinders
    private String name; // name.equals(name);  name == name1
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName(){
        return this.name;
    }

    public int getCylinders(){
        return this.cylinders;
    }

    @Override
    public String toString(){
        return "Cylinder : " + this.cylinders + " , Name : " + this.name;
    }
    // Car car1 = new Car(5, "Araba1");
    // System.out.println(car1);
    // org.example.company.Car@hghshr
    // Cylinder : 5 , Name : Araba1;

    /*double num1 = 10;
    double num2 = 20;
    if(num1 == num2){

    }*/

    /*String s1 = "Enis";

    String s2 = new String("Enis");

    s1 == s2 // yapamam

    s1.equals(s2);*/
    // == equals
    @Override
    public boolean equals(Object obj){

        if(obj == this)
            return true;
        // typeof js
        if(!(obj instanceof Car))
            return false;

        Car carObj = (Car) obj;

        return this.cylinders == carObj.cylinders &&
                this.name.equals(carObj.name);
    }

    // Car car = new Car();
    // car.toString();
    // System.out.println(car);

    // Car car1 = new Car(5, "Araba1"); // hfgdgsd
    // Car car2 = new Car(5, "Araba1"); // hfgfgsd
    // car1 == car2 -> referanslari farkli oldugundan false
    // car1.equals(car2); -> equals metodunu implement ettigimizden dolayi true
    // car1.equals(car1);
    // Student student1 = new Student();
    // car1.equals(student1); -> false

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
}
