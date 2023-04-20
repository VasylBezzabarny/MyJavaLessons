package family;


public class Main {
    public static void main( String[] args) {
        family.Pet pet = new family.Pet("dog", "Rock",5,75, new String[] {"eat","drink","sleep"});
//           pet.setSpecies("dog");
//           pet.setNickName("Rock");
//           pet.setAge(5);
//           pet.setTrickLevel(75);
//           pet.setHabits(new String[]{"eat","drink","sleep"});
        pet.eat();
        pet.respond();
        System.out.println(pet.toString());
        family.Pet petTwo = new family.Pet("dog", "Filya",10,35, new String[] {"walk","eat","sleep"});
        System.out.println(pet.equals(petTwo));



        String[][] schedule = {
                {"Sunday:", " do home work"},
                {"Monday:", " go to courses"}

        };
        // for (int i = 0; i < schedule.length; i++) {
//            for (int j = 0; j < schedule[i].length; j++) {
//                System.out.print(schedule[i][j]);
//            }
//            System.out.println();
//    }

        family.Human human = new family.Human("Michael", "Karleone", 1977, 90, schedule);
        family.Human mother = new family.Human("Jane", "Karleone", 1950 );
        family.Human father = new family.Human("Vito", "Karleone", 1950);
        family.Human[] children = new family.Human[3];
        family.Family family = new family.Family(mother, father, children, pet);
        children[0] = new family.Human("Ivan", "Karleone", 2005);
        children[0].setFamily(family);
        children[1] = new family.Human("Maria", "Karleone", 2010);
        children[1].setFamily(family);

        family.setPet(pet);
        family.greetPet();
        family.describePet();
        human.setSchedule(schedule);
        System.out.println(family.toString());

        family.Human newChild = new family.Human("Petro", "Karleone", 2015);
        family.addChild(newChild);
        System.out.println(human.toString());
        System.out.println(family.toString());


        family.deleteChild(0);
        System.out.println(family.toString());

        family.Family familyTwo = new family.Family(new family.Human("Ivanna", "Ivanova", 1965), new family.Human("Ivan", "Ivanov", 1966), new family.Human[]{new family.Human("Petr", "Ivanov", 2000)}, new family.Pet("cat", "Murka", 5, 90, new String[] {"sleep", "play"}));        System.out.println(familyTwo.toString());
    }
}
