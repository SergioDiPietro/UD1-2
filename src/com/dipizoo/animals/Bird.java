package com.dipizoo.animals;

enum Paw {PALMIPED, CLAW}

abstract class Bird extends Animal {

    // Attributes
    protected float flyHeight;
    protected String plumageColor;
    protected Paw pawType;
    public String[] plumageColors = {"Black", "Blue", "Brown", "Grey"};

    // Constructors
    public Bird() {
        this.flyHeight = (float)(Math.random()*3001);
        this.plumageColor = plumageColors[(int)(Math.random()*4)];
        this.pawType = Paw.CLAW;
    }

    public Bird(String name, short age, Gender gender, float flyHeight, String plumageColor, Paw pawType) {
        super(name, age, gender);
        this.flyHeight = flyHeight;
        this.plumageColor = plumageColor;
        this.pawType = pawType;
    }
}
