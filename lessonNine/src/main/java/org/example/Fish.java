package org.example;

import java.util.Set;

public class Fish extends Pet implements Foul {
    public Fish(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
    }
    @Override
    public String getSpecies() {
        return "Fish";
    }

    @Override
    public void eat() {

        super.eat();
    }

    @Override
    public void respond() {

    }


    @Override
    public void foul() {

    }
}
