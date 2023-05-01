package org.example.hw6;

public class Fish extends Pet implements Foul {
    public Fish(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
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
