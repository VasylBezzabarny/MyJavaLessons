package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.EnumSource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @org.junit.jupiter.api.Test
    void testToString() {

        Set<String> habits = new HashSet<String>();
        habits.add("eat");
        habits.add("drink");
        habits.add("sleep");
        Dog dog = new Dog("Rock",5,75, new HashSet<String>());
        String expected = "Dog{nickName='Rock', age=5, trickLevel=75, habits=[sleep, eat, drink]}";
        String actual = dog.toString();
        Assertions.assertEquals(expected, actual);
    }
}