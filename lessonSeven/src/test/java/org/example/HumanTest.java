package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HumanTest {
    @Test
    void testToString () {
        Map<String, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work");
        schedule.put(DayOfWeek.MONDAY.name(), "go to courses");
        Human human = new Human("Michael", "Karleone", 1977, 90, schedule);
        String expected = "Human{name='Michael', surname='Karleone', year=1977, iq=90, schedule=[[SUNDAY,  do home work], [MONDAY,  go to courses]]}";
        String actual = human.toString();
        Assertions.assertEquals(expected, actual);
    }


}
