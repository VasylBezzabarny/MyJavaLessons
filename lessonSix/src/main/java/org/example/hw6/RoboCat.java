package org.example.hw6;

public class RoboCat extends Pet {
    public RoboCat(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
    }

    public RoboCat() {

    }
    public void eat() {
        super.eat();
    }

    @Override
    public void respond() {
    }


}
