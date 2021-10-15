package com.dipizoo.management;

import java.util.ArrayList;
import com.dipizoo.animals.*;

public class Zoo {

    // Attributes
    private final short nSpaces;
    private final ArrayList<Space> spaces;

    // Constructors
    public Zoo(int nSpaces) {
        this.nSpaces = (short)nSpaces;
        this.spaces = new ArrayList<Space>();
    }

    //Methods
    public boolean addAnimals(Animal animal) {
        if (this.emptySpaces() > 0) {
            for (Space space : spaces) {
                if (space.getSpaceNumber() == this.emptySpaces()) {
                    space.setAnimal1(animal);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addAnimals(Animal animal1, Animal animal2) {
        if (this.emptySpaces() > 0) {
            for (Space space:spaces) {
                if (space.getSpaceNumber() == this.emptySpaces())
                    return space.fill(animal1, animal2);
            }
        }
        return false;
    }

    public boolean fillZooRandomly(int nAnimals) {
        if (((double)nAnimals/2) > nSpaces) return false;
        else {
            for (int i = 1; i <= nSpaces; i++) {
                Space currentSpace = new Space((short) i);
                if (nAnimals > 1) {
                    currentSpace.fillSpaceRandomly(true);
                    nAnimals -= 2;
                } else if (nAnimals == 1) {
                    currentSpace.fillSpaceRandomly(false);
                    nAnimals--;
                }
                spaces.add(currentSpace);
            }
            return true;
        }
    }

    private short emptySpaces() {
        for (Space space:spaces) {
            if (space.getAnimal1() == null) return space.getSpaceNumber();
        }
        return (short)0;
    }

    public String getZooInfo() {
        String zooInfo = "";
        for (Space space:spaces) {
            zooInfo += space.getSpaceInfo();
        }
        return zooInfo+"\n";
    }
}
