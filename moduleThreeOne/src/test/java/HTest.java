import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HTest {
    @BeforeClass
    public void classSetup() {
        System.out.println("List of surnames prepared:");
    }
@Test
    public void LastNameTest(){
    List<String> lastNames = new ArrayList<>(Arrays.asList("Ivanov", "Petrov", "Sidorov"));
    System.out.println(lastNames);
    SoftAssertions softAssertions = new SoftAssertions();
    softAssertions.assertThat(lastNames)
            .as("List of surnames")
            .isNotNull()
            .contains("Ivanov", "Petrov", "Sidorov")
            .hasSize(3)
            .noneMatch(s -> s.matches(".*[0-9].*"));
    softAssertions.assertAll();
    }
    @AfterClass
    public void classClose() {
        System.out.println("Close list of families");
    }

}

