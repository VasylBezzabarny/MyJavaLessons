package org.example.hw6;

public class Dog extends  Pet implements Foul {

    public Dog(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        setSpecies(Species.DOG);
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
