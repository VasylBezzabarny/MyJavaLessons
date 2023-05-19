package org.example;

final class Man extends Human {
    public Man(String name, String surname) {
        super(name, surname);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hi" + pet.getNickName());
    }
    public void repairCar() {
        System.out.println("Чинить авто");
    }
}
