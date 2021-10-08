package com.dipizoo.animals;

enum Time {DAY, NIGHT}
enum Diet {CARNIVORE, OMNIVORE, HERBIVORE}

abstract class Mammal extends Animal {

    // Attributes
    protected float weigh;
    protected Time timeHabit;
    protected float movSpeed;
    protected Diet diet;

    // Constructors
    public Mammal() {
        this.weigh = (float)(Math.random()*201);
        if (Math.random() >= 0.5) this.timeHabit = Time.DAY;
        else this.timeHabit = Time.NIGHT;
        this.movSpeed = (short)(Math.random()*56);
        if (Math.random() >= 0.33) this.diet = Diet.OMNIVORE;
        else if (Math.random() >= 0.66) this.diet = Diet.CARNIVORE;
        else this.diet = Diet.HERBIVORE;
    }

    public Mammal(String name, short age, Gender gender, float weigh, Time timeHabit, float movSpeed, Diet diet) {
        super(name, age, gender);
        this.weigh = weigh;
        this.timeHabit = timeHabit;
        this.movSpeed = movSpeed;
        this.diet = diet;
    }
}
