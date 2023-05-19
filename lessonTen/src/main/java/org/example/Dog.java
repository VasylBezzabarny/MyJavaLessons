package org.example;

import java.util.Set;

public class Dog extends  Pet implements Foul {

    public Dog(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
    }
    public Dog(String nickName){
        super(nickName);
    }
    @Override
    public String getSpecies() {
        return "Dog";
    }


    @Override
    public void eat() {

        super.eat();
    }

    @Override
    public void respond() {
        System.out.println("Gav Gav!");
    }


    @Override
    public void foul() {
        System.out.println("This is not I");
    }
}
