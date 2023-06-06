package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class AjaxyPage {
        WebDriver driver;


        @FindBy(id = "text")
        private WebElement newLabelText;

        @FindBy(id = "color")
        private WebElement labelColorSelect;

        @FindBy(id = "addLabel")
        private WebElement addLabelButton;

        public AjaxyPage(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);
        }
        public void enterLabelText(String labelText) {
                newLabelText.clear();
                newLabelText.sendKeys(labelText);
        }
        public void clickColorButton(String color) {
                if (color != null && !color.isEmpty()) {
                        WebElement colorButton;
                        if (color.equalsIgnoreCase("Red")) {
                                colorButton = driver.findElement(By.cssSelector("input[name='color'][value='red']"));
                        } else if (color.equalsIgnoreCase("Green")) {
                                colorButton = driver.findElement(By.cssSelector("input[name='color'][value='green']"));
                        } else {
                                throw new IllegalArgumentException("Invalid color. Please choose 'Red' or 'Green'.");
                        }
                        colorButton.click();
                }
        }
        public void clickAddLabelButton() {
                addLabelButton.click();
        }
}
