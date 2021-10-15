package com.dipizoo.management;

import com.dipizoo.animals.*;

public class Space {

    // Attributes
    private final short spaceNumber;
    private Animal animal1 = null;
    private Animal animal2 = null;

    // Constructors
    public Space(short spaceNumber) {
        this.spaceNumber = spaceNumber;
    }

    public Space(short spaceNumber, Animal animal) {
        this.spaceNumber = spaceNumber;
        this.animal1 = animal;
    }

    public Space(short spaceNumber, Animal animal1, Animal animal2) {
        this.spaceNumber = spaceNumber;
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    // Getters & Setters
    public short getSpaceNumber() {
        return spaceNumber;
    }

    public Animal getAnimal1() {
        return animal1;
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }

    public Animal getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }

    // Methods
    public boolean fill(Animal animal1, Animal animal2) {
        if (animal1.getClass() == animal2.getClass()) {
            if (animal1.getGender() == animal2.getGender()) {
                setAnimal1(animal1);
                setAnimal2(animal2);
                return true;
            }
        }
        return false;
    }

    public void fillSpaceRandomly(boolean pair) {
        short spices = (short)(Math.random()*10);
        if (pair) {
            if (spices == 1) {
                animal1 = new BlackMamba();
                animal2 = new BlackMamba();
            } else if (spices == 2) {
                animal1 = new Chamelon();
                animal2 = new Chamelon();
            } else if (spices == 3) {
                animal1 = new Dolphin();
                animal2 = new Dolphin();
            } else if (spices == 4) {
                animal1 = new Falcon();
                animal2 = new Falcon();
            } else if (spices == 5) {
                animal1 = new Gorilla();
                animal2 = new Gorilla();
            } else if (spices == 6) {
                animal1 = new Kiwi();
                animal2 = new Kiwi();
            } else if (spices == 7) {
                animal1 = new KomodoDragon();
                animal2 = new KomodoDragon();
            } else if (spices == 8) {
                animal1 = new Peacock();
                animal2 = new Peacock();
            } else {
                animal1 = new Tiger();
                animal2 = new Tiger();
            }
            animal1.setGender(Gender.MALE);
            animal2.setGender(Gender.FEMALE);

        } else {
            if (spices == 1) {
                animal1 = new BlackMamba();
            } else if (spices == 2) {
                animal1 = new Chamelon();
            } else if (spices == 3) {
                animal1 = new Dolphin();
            } else if (spices == 4) {
                animal1 = new Falcon();
            } else if (spices == 5) {
                animal1 = new Gorilla();
            } else if (spices == 6) {
                animal1 = new Kiwi();
            } else if (spices == 7) {
                animal1 = new KomodoDragon();
            } else if (spices == 8) {
                animal1 = new Peacock();
            } else if (spices == 9) {
                animal1 = new Tiger();
            }
        }
    }

    public String getSpaceInfo() {
        if (animal1 == null) {
            return ("\n" +
                    "┌───────────────────────────┐" + "\n" +
                    "│\t\tSpace number " + spaceNumber + "\t\t│" + "\n" +
                    "└───────────────────────────┘" + "\n" +
                    "──────────────────────────────┐" + "\n" +
                    " * Empty * " + "\n" +
                    "──────────────────────────────┘"
            );
        }else if (animal2 == null) {
            return ("\n" +
                    "┌───────────────────────────┐" + "\n" +
                    "│\t\tSpace number " + spaceNumber + "\t\t│" + "\n" +
                    "└───────────────────────────┘" + "\n" +
                    "──────────────────────────────┐" + "\n" +
                    animal1.getAnimalInfo() + "\n" +
                    "──────────────────────────────┘"
            );
        } else {
            return ("\n" +
                    "┌───────────────────────────┐" + "\n" +
                    "│\t\tSpace number " + spaceNumber + "\t\t│" + "\n" +
                    "└───────────────────────────┘" + "\n" +
                    "──────────────────────────────┐" + "\n" +
                    animal1.getAnimalInfo() + "\n" +
                    "──────────────────────────────" + "\n" +
                    animal2.getAnimalInfo() + "\n" +
                    "──────────────────────────────┘" + "\n"
            );
        }
    }
}