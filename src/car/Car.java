package car;

import car.Break;

/**
 * Created by AM!N on 11/24/2016.
 * the main class is car
 * every method is here
 * when u call it the main method in that wanted class will be called
 */
public class Car extends Movables {
    private String model = "";
    private double weight = 0;
    private double width = 0;
    private double length = 0;
    private double price = 0;
    private double velocity = 0;
    private double firstBodyResistance = 0;
    private double inGameBodyResistance = 0;
    private double repairCostRatio = 0;
    Engine engine = new Engine();
    Break breaker = new Break();
    Wheel wheel = new Wheel();
    private String color = "";
    private Boolean isNamahsoos = false;
    private Boolean isRacing = false;

    //constructor
    public Car(double weight, String model, double width, double length, double price,
               double repairCostRatio, double firstBodyResistance,
               String color, Boolean isNamahsoos, Boolean isRacing,
               double topSpeed, double engineAcceleration, double breakAcceleration) {
        this.weight = weight;
        this.model = model;
        this.width = width;
        this.length = length;
        this.price = price;
        this.repairCostRatio = repairCostRatio;
        this.firstBodyResistance = firstBodyResistance;
        this.color = color;
        this.isNamahsoos = isNamahsoos;
        this.isRacing = isRacing;
        this.engine.setTopSpeed(topSpeed);
        this.engine.setAcceleration(engineAcceleration);
        this.breaker.setAcceleration(breakAcceleration);//should be negative

    }


    //getters and setters


    public double getInGameBodyResistance() {
        return inGameBodyResistance;
    }

    public void setInGameBodyResistance(double inGameBodyResistance) {
        this.inGameBodyResistance = inGameBodyResistance;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRepairCostRatio() {
        return repairCostRatio;
    }

    public void setRepairCostRatio(double repairCostRatio) {
        this.repairCostRatio = repairCostRatio;
    }

    public double getBodyResistance() {
        return firstBodyResistance;
    }

    public void setBodyResistance(double firstBodyResistance) {
        this.firstBodyResistance = firstBodyResistance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getNamahsoos() {
        return isNamahsoos;
    }

    public void setNamahsoos(Boolean namahsoos) {
        isNamahsoos = namahsoos;
    }

    public Boolean getRacing() {
        return isRacing;
    }

    public void setRacing(Boolean racing) {
        isRacing = racing;
    }


    //methods:
    public double radiusOfCharkhesh() {//call this method for getting radius of charkesh:D
        double r = wheel.radiusOfCharkhesh(this.weight, this.velocity);
        return r;
    }

    public void velocityCheker() { //check if velocity is in top speed range
        if (this.velocity > engine.getTopSpeed())
            velocity = engine.getTopSpeed();
        else if (-(this.velocity) > engine.getTopSpeed())
            velocity = -(engine.getTopSpeed());
    }

    public void velocityChange(double t) { // change of velocity by with acceleration
        velocity = velocity + ((engine.getAcceleration()) * t);
        velocityCheker();
    }

    public void breaksVelocity(double t) { // new velocity after break
        velocity = velocity + ((breaker.getAcceleration()) * t);
        velocityCheker();
    }

    public double repairCost() { // if the olayer had this much money call the next method for repairing
        double a = firstBodyResistance - inGameBodyResistance;
        return (a * repairCostRatio);
    }

    public void repair() { // after knowing if player got enough money call this method to full repair it
        inGameBodyResistance = firstBodyResistance;
    }

    public boolean ifRepairNeeded() { //check whether repair is needed or not (checking if under 30%)
        if (inGameBodyResistance >= ((30 / 100) * firstBodyResistance))
            return false;

            return true;


    }

}

