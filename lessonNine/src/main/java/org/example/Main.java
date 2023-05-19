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
      human.setSchedule(schedule);
      System.out.println(family);
      human.setSchedule(schedule);
      System.out.println(family.toString());
      Human newChild = new Human("Petro", "Karleone", 2015);
      family.addChild(newChild);
      System.out.println(human.toString());
      System.out.println(family.toString());
      int indexToDelete = 2;
      boolean isDeleted = family.deleteChild(indexToDelete);
      List<Human> childrenN = new ArrayList<Human>();
      childrenN.add(new Human("Petr", "Ivanov", 2000));
      Family familyTwo = new Family(new Human("Ivanna", "Ivanova", 1965), new Human("Ivan", "Ivanov", 1966), childrenN, Species.FISH);
      System.out.println(familyTwo.toString());



      FamilyService familyService = new FamilyService(new CollectionFamilyDao());
      FamilyController familyController = new FamilyController(familyService);
      Human father1 = new Man("Ivan", "Karleone",1980);
      Human mother1 = new Woman("Ivanka", "Karleone", 1980);
      familyController.createNewFamily(father1, mother1);
      Human father2 = new Man("Petr", "Marleone", 1985);
      Human mother2 = new Woman("Petra", "Marleone", 1987);
      familyController.createNewFamily(father2, mother2);

      List<Family> allFamilies = familyController.getAllFamilies();
      familyController.displayAllFamilies();
      familyController.getFamiliesBiggerThan(2);
      familyController.getFamiliesLessThan(4);

      int count = familyController.countFamiliesWithMemberNumber(3);
      System.out.println("Number of families with 2 members: " + count);

      Family family1 = familyController.getFamilyById(0);
      Family family2 = familyController.getFamilyById(1);

      familyController.bornChild(family1, "Misha", "Ola");
      familyController.adoptChild(family2, new Woman("Anna", "Petrova", 2010));

      familyController.deleteAllChildrenOlderThen(18);



      Set<Pet> pets = new HashSet<>();
      Pet pet = new Dog("Fil",10,35, new HashSet<String>(habits));
      pets.add(pet);
      family.setPet(pets);
      familyController.addPet(1, dog);

    }


}
