package org.example;


import java.util.Arrays;

public class Main {
    public static void main( String[] args) {
        Species dog = Species.DOG;
        Species cat = Species.CAT;
        Pet pet = new Pet(dog, "Rock",5,75, new String[] {"eat","drink","sleep"});

        pet.eat();
        pet.respond();
        System.out.println(pet.toString());
        Pet petTwo = new Pet(dog, "Filya",10,35, new String[] {"walk","eat","sleep"});
        System.out.println(pet.equals(petTwo));



        String[][] schedule = {
                {DayOfWeek.SUNDAY.name(), " do home work"},
                {DayOfWeek.MONDAY.name(), " go to courses"}

        };

        Human human = new Human("Michael", "Karleone", 1977, 90, schedule);
        Human mother = new Human("Jane", "Karleone", 1950 );
        Human father = new Human("Vito", "Karleone", 1950);
        Human[] children = new Human[2];
        Family family = new Family(mother, father, children, pet);
        children[0] = new Human("Ivan", "Karleone", 2005);
        children[0].setFamily(family);
        children[1] = new Human("Maria", "Karleone", 2010);
        children[1].setFamily(family);

        family.setPet(pet);
        family.greetPet();
        family.describePet();
        human.setSchedule(schedule);
        System.out.println(family.toString());

        Human newChild = new Human("Petro", "Karleone", 2015);
        family.addChild(newChild);
        System.out.println(human.toString());
        System.out.println(family.toString());

        family.deleteChild(0);
        System.out.println(family.toString());

        Family familyTwo = new Family(new Human("Ivanna", "Ivanova", 1965), new Human("Ivan", "Ivanov", 1966), new Human[]{new Human("Petr", "Ivanov", 2000)}, new Pet(cat, "Murka", 5, 90, new String[] {"sleep", "play"}));
        System.out.println(familyTwo.toString());
    }
}
