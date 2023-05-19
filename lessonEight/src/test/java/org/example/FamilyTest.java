package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.DayOfWeek;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FamilyTest {
    private List<Human> children = new ArrayList<>();
    private Family family;
//    private Pet pet;
//    private Dog dog;

    @BeforeEach
    public void setUp() {
        Set<String> habits = new HashSet<String>();
        habits.add("eat");
        habits.add("drink");
        habits.add("sleep");
        Dog dog = new Dog("Rock",5,75, habits);

        System.out.println(dog.toString());
        Dog dogTwo = new Dog ("Filya",10,35, habits);
        System.out.println(dog.equals(dogTwo));

        Map<String, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work");
        schedule.put(DayOfWeek.MONDAY.name(), "go to courses");

        Human human = new Human("Michael", "Karleone", 1977, 90, schedule);
        Human mother = new Human("Jane", "Karleone", 1950 );
        Human father = new Human("Vito", "Karleone", 1950);
        this.children = new ArrayList<>();
        this.children.add(new Human("Ivan", "Karleone", 2005));
        this.children.add(new Human("Maria", "Karleone", 2010));

        this.family = new Family(mother, father, children, Species.DOG);
        family.setPet(dog);
        family.setChildren(this.children);
    }
    @Test
    void testToString () {
        String expected = "Family{ mother=Jane Karleone, father=Vito Karleone, children=[Human{name='Ivan', surname='Karleone', year=2005, iq=0, schedule=null}, Human{name='Maria', surname='Karleone', year=2010, iq=0, schedule=null}], pet=Dog{nickName='Rock', age=5, trickLevel=75, habits=[sleep, eat, drink]}}";
        String actual = this.family.toString();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void deleteChildIndexPositive() {
        int resultBefore = family.getChildren().size();
        family.deleteChild(1);
        Assertions.assertEquals(family.getChildren().size(), resultBefore-1);

    }

    @Test
    public void deleteChildIndexNegative() {
        int resultBefore = family.getChildren().size();
        boolean deleted = family.deleteChild(2);
        Assertions.assertFalse(deleted);
        Assertions.assertEquals(resultBefore, family.getChildren().size());
    }

    @Test
    public void testDeleteChildPositive() {
        Human childToDelete =new Human("Ivan", "Karleone", 2005);
        family.deleteChild(childToDelete);
        Assertions.assertFalse(family.getChildren().contains(childToDelete));
    }

    @Test
    public void testDeleteChildNegative() {
        List<Human> childrenBefore = new ArrayList<>(family.getChildren());
        family.deleteChild(new Human("Anna","Petrova", 1900));
        Assertions.assertEquals(childrenBefore, family.getChildren());
    }

    @Test
    public void testAddChild() {
        int resultBefore = family.getChildren().size();
        Human newChild = new Human("Petro", "Karleone", 2015);
        family.addChild(newChild);
        List<Human> actualChildren = family.getChildren();
        Assertions.assertEquals(resultBefore + 1, family.getChildren().size());
    }



    @Test
    public void testCountFamily() {
        family.addChild(new Human("Petro", "Karleone", 2015));
        Assertions.assertEquals(5, family.countFamily());
    }
}
