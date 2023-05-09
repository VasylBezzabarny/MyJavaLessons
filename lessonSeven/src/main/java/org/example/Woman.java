package org.example;

final class Woman extends Human {
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hello" + pet.getNickName());
    }
    public void makeUp(){
        System.out.println("Подкраситься");
    }
}
