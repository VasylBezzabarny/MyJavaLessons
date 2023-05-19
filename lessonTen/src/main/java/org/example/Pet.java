package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    private String nickName;
    private int age;
    private int trickLevel;
    private Set<String> habits = new HashSet<String>();



    public Pet(String nickName) {

        this.nickName = nickName;
    }

    public Pet(String nickName, int age, int trickLevel, Set<String> habits) {
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet() {

    }

    public String getNickName() {

        return nickName;
    }

    public void setNickName(String nickName) {

        this.nickName = nickName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getTrickLevel() {

        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {

        this.trickLevel = trickLevel;
    }

    public Set <String> getHabits() {

        return habits;
    }

    public void setHabits(Set<String> habits) {

        this.habits = habits;
    }

    @Override
    public String toString() {
        return  getSpecies()+"{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits.toString() +
                '}';
    }

    public abstract String getSpecies();

    public void eat() {

        System.out.println("Я кушаю");
    }

    public abstract void respond();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getNickName(), pet.getNickName()) && Objects.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNickName(), getAge(), getTrickLevel(), getHabits());
    }
}