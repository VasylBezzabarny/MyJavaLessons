package tests;
import org.example.AjaxyPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class AjaxyTest {
    private ChromeDriver driver;
    private AjaxyPage ajaxyPage;
    private By typerInputLocator = By.xpath("//input[@name='typer' and @type='text']");
    private By[] colorInputLocators = {
            By.xpath("//input[@id='red' and @value='red']"),
            By.xpath("//input[@id='green' and @value='green']")
    };
    private By addLabelButtonLocator = By.xpath("//input[@name='submit' and @value='Add Label']");
    @BeforeEach
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/crown/Downloads/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        ajaxyPage = new AjaxyPage(driver);
    }
    @Test
    public void addLabelTest() throws InterruptedException {
        driver.get("https://www.selenium.dev/selenium/web/ajaxy_page");

        WebElement typerInput = driver.findElement(typerInputLocator);
        typerInput.sendKeys("12345");

        Random random = new Random();
        int randomColorIndex = random.nextInt(colorInputLocators.length);
        By randomColorInputLocator = colorInputLocators[randomColorIndex];
        driver.findElement(randomColorInputLocator).click();

        WebElement addLabelButton = driver.findElement(addLabelButtonLocator);
        addLabelButton.click();
        Thread.sleep(15000);


    }

    @AfterEach
    public void afterTest() {
        driver.close();
    }

}
