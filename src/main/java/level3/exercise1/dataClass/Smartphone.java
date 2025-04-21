package level3.exercise1.dataClass;

import level3.exercise1.interfaces.Phone;

public class Smartphone implements Phone {
    private int number;
    private String brand;
    private String model;
    private String color;

    public Smartphone(int number, String brand, String model, String color){
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public String getDescription() {
        return brand + " " + model + " in " + color + " color";
    }

    @Override
    public void call() {
        System.out.println("I want to call "+ number);
    }
    public void takePhotos(){
        System.out.println("I need to take photos, i like this");
    }

    @Override
    public String toString() {

            return getDescription() + " - Number: " + number;
        }

    }

