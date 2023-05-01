package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FamilyTest {
    private Family family;
    private Human[] children;

    @BeforeEach
    public void setUp() {
        Species dog = Species.DOG;
        Pet pet = new Pet( dog, "Rock",5,75, new String[] {"eat","drink","sleep"});
        Human mother = new Human("Jane", "Karleone", 1950 );
        Human father = new Human("Vito", "Karleone", 1950);
        children = new Human[2];
        children[0] = new Human("Ivan", "Karleone", 2005);
        children[1] = new Human("Maria", "Karleone", 2010);
        family = new Family(mother, father, children, pet);
    }
    @Test
    void testToString () {
        String expected = "Family{ mother=Jane Karleone, father=Vito Karleone, children=[Human{name='Ivan', surname='Karleone', year=2005, iq=0, schedule=null}, Human{name='Maria', surname='Karleone', year=2010, iq=0, schedule=null}], pet=dog{nickName='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}";
        String actual = family.toString();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void deleteChildIndexPositive() {
        boolean deleted = family.deleteChild(1);
        Assertions.assertTrue(deleted);
        Human[] expectedChildren = {children[0], children[1]};
        Assertions.assertArrayEquals(expectedChildren, family.getChildren());
    }

    @Test
    public void deleteChildIndexNegative() {
        boolean deleted = family.deleteChild(5);
        Assertions.assertFalse(deleted);
        Human[] expectedChildren = {children[0], children[1]};
        Assertions.assertArrayEquals(expectedChildren, family.getChildren());
    }


    @Test
    public void testDeleteChildPositive() {
        Human childToDelete = children[0];
        family.deleteChild(childToDelete);
        Assertions.assertFalse(Arrays.asList(children).contains(childToDelete));
    }

    @Test
    public void testDeleteChildNegative() {
        String resultBefore = Arrays.toString(family.getChildren());
        family.deleteChild(new Human("Anna","Petrova", 1900));
        Assertions.assertEquals(resultBefore, Arrays.toString(family.getChildren()));
    }

    @Test
    public void testAddChild() {
        Human newChild = new Human("Petro", "Karleone", 2015);
        family.addChild(newChild);
        Human[] expectedChildren = { children[0], children[1], newChild};
        Assertions.assertArrayEquals(expectedChildren, family.getChildren());
    }



    @Test
    public void testCountFamily() {
        family.addChild(new Human("Petro", "Karleone", 2015));
        Assertions.assertEquals(5, family.countFamily());
    }
}