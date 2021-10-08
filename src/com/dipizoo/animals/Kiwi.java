package com.dipizoo.animals;

public class Kiwi extends Bird {

    // Constructors
    public Kiwi() {
        super();
    }

    public Kiwi(String name, short age, Gender gender, float flyHeight, String plumageColor, Paw pawType) {
        super(name, age, gender, flyHeight, plumageColor, pawType);
    }

    // Methods
    public String getAnimalInfo() {
        return ("Spices: " + this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1) + "\n" +
                "Name: " + this.name + "\n" +
                "Age: " + this.age + " years old \n" +
                "Gender: " + this.gender + "\n" +
                "Fly height: " + this.flyHeight + "m \n" +
                "Plumage color: " + this.plumageColor + "\n" +
                "Paw type: " + this.pawType
        );
    }
}