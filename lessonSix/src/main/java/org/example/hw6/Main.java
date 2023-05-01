package org.example.hw6;


public class Main {
    public static void main( String[] args) {
      Dog dog = new Dog ("Rock",5,75, new String[] {"eat","drink","sleep"});
      dog.eat();
      dog.respond();
      System.out.println(dog.toString());
      Dog dogTwo = new Dog("Filya",10,35, new String[] {"walk","eat","sleep"});
      System.out.println(dog.equals(dogTwo));
      String[][] schedule = {
                {DayOfWeek.SUNDAY.name(), " do home work"},
                {DayOfWeek.MONDAY.name(), " go to courses"}

        };

        Human human = new Human("Michael", "Karleone", 1977, 90, schedule);
        Human mother = new Human("Jane", "Karleone", 1950 );
        Human father = new Human("Vito", "Karleone", 1950);
        Human[] children = new Human[2];
        Family family = new Family(mother, father, children, Species.DOG);
        children[0] = new Human("Ivan", "Karleone", 2005);
        children[0].setFamily(family);
        children[1] = new Human("Maria", "Karleone", 2010);
        children[1].setFamily(family);

        family.setPet(dog);
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
        Species pet = new Dog("Murka", 5, 90, new String[] {"sleep", "play"}).getSpecies();
        Family familyTwo = new Family(new Human("Ivanna", "Ivanova", 1965), new Human("Ivan", "Ivanov", 1966), new Human[]{new Human("Petr", "Ivanov", 2000)}, pet);
        System.out.println(familyTwo.toString());


      dog.respond();
      dog.foul();
      Fish fish = new Fish ("Bb", 5, 35, new String[] {"sweam", "eat"});
      fish.respond();
      fish.foul();

      DomesticCat domesticCat =new DomesticCat ("Cat", 5, 55, new String[] {"sleep", "eat"});
      domesticCat.respond();
      domesticCat.foul();
      RoboCat roboCat = new RoboCat();
      roboCat.respond();
    }


}
