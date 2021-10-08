package com.dipizoo.animals;

public class Chamelon extends Reptile {

    // Constructors
    public Chamelon() {
        super();
    }

    public Chamelon(String name, short age, Gender gender, float bodyTemperature, String scaleColor, short movSpeed) {
        super(name, age, gender, bodyTemperature, scaleColor, movSpeed);
    }

    // Methods
    public String getAnimalInfo() {
        return ("Spices: " + this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1) + "\n" +
                "Name: " + this.name + "\n" +
                "Age: " + this.age + " years old \n" +
                "Gender: " + this.gender + "\n" +
                "Body temperature: " + this.bodyTemperature + "ºC \n" +
                "Scale color: " + this.scaleColor + "\n" +
                "Movement speed: " + this.movSpeed + "Km/h"
        );
    }
}