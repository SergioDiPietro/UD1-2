package com.dipizoo.animals;

enum Gender {MALE, FEMALE}

public abstract class Animal {

    // Attributes
    protected String name;
    protected short age;
    protected Gender gender;
    public static String[] names = {"Tifón", "El bicho ", "Mango", "Piña", "Juan", "Yasuo", "Misifú","Bobon", "Rantanplán",
            "Harambe", "Chimuelo", "Yogu", "Petisuí", "Brego", "Eren YEGA", "Tora", "Yumeko", "Bley", "Marco",
            "Chiquito", "Carajito", "Iniesta", "Mikasa", "Teemo", "Nube", "Thurston Waffles", "Luna", "Hammer",
            "Estrella", "Copito de Nieve", "Valentin", "Alfredo", "Messi", "Dio", "Boludo", "Jojo", "Marselo",
            "Patrisio", "Mariko", "Makina", "Titan", "Arepita", "El Batu", "Chispitas", "Zarpitas", "Nevado", "Doramion",
            "Bodoque", "Itachi", "Benito Antonio Martínez Ocasio", "Goku", "Anuel", "Añañin", "Manitas",
            "Christian Macias", "Ete-Sech", "Luigi", "Elma Sapán", "Buitoni", "Elso Bradillo", "Tarradellas", "Apache",
            "Bill Puertas", "Esteban Quito", "Esteban Trabajos", "Kerry Kopo John", "Elsa Pato", "Sapo", "Maggie",
            "Wachin che", "Matías", "Elsa bado", "Yoshikomo", "Firulais", "Tom Nook", "Sebastian", "Pompoco",
            "Barsinson", "Enrique", "Doge", "Hachiko ;( ", "P.E.K.K.A.", "Cheems", "Mini Pekka", "MaxiBon", "Homero",
            "Sly Cooper", "Armor King", "Montapuercos", "Yoshimitsu", "Aiv4n"};

    // Constructors
    public Animal() {
        this.name = names[(int)(Math.random()* (names.length))];
        this.age = (short)(Math.random()*16);
        if (Math.random() >= 0.5) this.gender = Gender.FEMALE;
        else this.gender = Gender.MALE;
    }

    public Animal(String name, short age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters & Setters
    protected void setAge(short age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    // Methods
    public void birthday() {
        setAge((short)((this.age)+1));
    }

    public abstract String getAnimalInfo();
}