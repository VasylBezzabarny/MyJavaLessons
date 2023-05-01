package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HumanTest {
    @Test
    void testToString () {
        Human human = new Human("Michael", "Karleone", 1977, 90, new String[][] {
                {DayOfWeek.SUNDAY.name(), " do home work"},
                {DayOfWeek.MONDAY.name(), " go to courses"}

        });
        String expected = "Human{name='Michael', surname='Karleone', year=1977, iq=90, schedule=[[SUNDAY,  do home work], [MONDAY,  go to courses]]}";
        String actual = human.toString();
        Assertions.assertEquals(expected, actual);
    }


}
