package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.EnumSource;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Species dog = Species.DOG;
        Pet pet = new Pet(dog, "Rock",5,75, new String[] {"eat","drink","sleep"});
        String expected = "dog{nickName='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}";
        String actual = pet.toString();
        Assertions.assertEquals(expected, actual);
    }
}