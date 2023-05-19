package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<String, String> schedule;
    private Family family;


    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, long birthDate ) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }


    public Human(String name, String surname, String birthDate, int iq,  Map <String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = parseBirthDate(birthDate);
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = parseBirthDate(birthDate);
        this.iq = iq;
    }
    private long parseBirthDate(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(birthDate, formatter);
        return date.toEpochDay();
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
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
    public String describeAge() {
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.ofEpochDay(birthDate);
        Period age = Period.between(birth, today);
        return String.format("Age: %d years, %d months, %d days",
                age.getYears(), age.getMonths(), age.getDays());
    }





    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.ofEpochDay(birthDate);
        String formattedDate = date.format(formatter);
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + formattedDate +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
}
