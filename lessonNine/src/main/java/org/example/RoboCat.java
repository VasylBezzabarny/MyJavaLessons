package org.example;

import java.util.Set;

public class RoboCat extends Pet {
    public RoboCat(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
    }

    public RoboCat() {

    }
    @Override
    public String getSpecies() {
        return "RoboCat";
    }
    public void eat() {
        super.eat();
    }

    @Override
    public void respond() {
    }


}
