package com.dipizoo.animals;

abstract class Reptile extends Animal {

    // Attributes
    protected float bodyTemperature;
    protected String scaleColor;
    protected short movSpeed;
    public String[] scaleColors = {"Red", "Black", "Green", "Brown", "White", "Grey"};

    // Constructors
    public Reptile() {
        this.bodyTemperature = (float)(Math.random()*36);
        this.scaleColor = scaleColors[(int)(Math.random()*6)];
        this.movSpeed = (short)(Math.random()*11);
    }

    public Reptile(String name, short age, Gender gender, float bodyTemperature, String scaleColor, short movSpeed) {
        super(name, age, gender);
        this.bodyTemperature = bodyTemperature;
        this.scaleColor = scaleColor;
        this.movSpeed = movSpeed;
    }
}
