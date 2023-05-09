package org.example;

import java.util.Arrays;
import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String, String> schedule;
    private Family family;

    public Human(String name, String surname, int year ) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq,  Map <String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getIq() {

        return iq;
    }

    public void setIq(int iq) {

        this.iq = iq;
    }

    public  Map<String, String> getSchedule() {

        return schedule;
    }

    public void setSchedule( Map <String, String> schedule) {

        this.schedule = schedule;
    }
    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {

        this.family = family;
    }

    public void greetPet(Pet pet) {

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
}
