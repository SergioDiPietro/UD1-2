package com.dipizoo.animals;

public class Tiger extends Mammal {

    // Constructors
    public Tiger() {
        super();
    }

    public Tiger(String name, short age, Gender gender, float weigh, Time timeHabit, float movSpeed, Diet diet) {
        super(name, age, gender, weigh, timeHabit, movSpeed, diet);
    }

    // Methods
    public String getAnimalInfo() {
        return ("Spices: " + this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1) + "\n" +
                "Name: " + this.name + "\n" +
                "Age: " + this.age + " years old \n" +
                "Gender: " + this.gender + "\n" +
                "Weigh: " + this.weigh + "Kg \n" +
                "Time habit: " + this.timeHabit + "\n" +
                "Movement speed: " + this.movSpeed + "Km/h \n" +
                "Diet: " + this.diet
        );
    }
}