package org.example;


import java.util.*;

public class Main {

    public static void main( String[] args) {
      Set<String> habits = new HashSet<String>();
      habits.add("eat");
      habits.add("drink");
      habits.add("sleep");
      Dog dog = new Dog("Rock",5,75, new HashSet<String>(habits));

      System.out.println(dog.toString());
      Dog dogTwo = new Dog ("Filya",10,35, new HashSet<String>(habits));
      System.out.println(dog.equals(dogTwo));

      Map<String, String> schedule = new HashMap<>();
      schedule.put(DayOfWeek.SUNDAY.name(), "do home work");
      schedule.put(DayOfWeek.MONDAY.name(), "go to courses");

      Human human = new Human("Michael", "Karleone", 1977, 90, schedule);
      Human mother = new Human("Jane", "Karleone", 1950 );
      Human father = new Human("Vito", "Karleone", 1950);
      List<Human> children = new ArrayList<>();
      children.add(new Human("Ivan", "Karleone", 2005));
      children.add(new Human("Maria", "Karleone", 2010));

      Family family = new Family(mother, father, children, Species.DOG);
      family.setPet(dog);
      family.greetPet();
      family.describePet();
      human.setSchedule(schedule);
      System.out.println(family);

        family.greetPet();
        family.describePet();
        human.setSchedule(schedule);
        System.out.println(family.toString());

        Human newChild = new Human("Petro", "Karleone", 2015);
        family.addChild(newChild);
        System.out.println(human.toString());
        System.out.println(family.toString());

        int indexToDelete = 2;
        boolean isDeleted = family.deleteChild(indexToDelete);

        Fish fish  = new Fish ("Murka", 5, 90, new HashSet<String>(habits));
        family.setPet(fish);
        List<Human> childrenN = new ArrayList<Human>();
        childrenN.add(new Human("Petr", "Ivanov", 2000));
        Family familyTwo = new Family(new Human("Ivanna", "Ivanova", 1965), new Human("Ivan", "Ivanov", 1966), childrenN, Species.FISH);

        System.out.println(familyTwo.toString());


      dog.respond();
      dog.foul();
      fish.respond();
      fish.foul();

      DomesticCat domesticCat =new DomesticCat ("Cat", 5, 55, new HashSet<String>(habits));
      domesticCat.respond();
      domesticCat.foul();
      RoboCat roboCat = new RoboCat();
      roboCat.respond();
    }


}
