package ru.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.praktikum.enums.FaqList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.praktikum.config.Config.URL;

public class MainPageObject {
    WebDriver driver;
    String dropDownElement;
    String dropDownText;
    String expected;

    public MainPageObject(FaqList faqList, WebDriver driver) {
        this.driver = driver;
        driver.get(URL);
        this.dropDownElement = faqList.getButtonIndex();
        this.dropDownText = faqList.getElementIndex();
        this.expected = faqList.getExpected();
    }

    public MainPageObject() {
    }

    private final By firstOrderButton = By.className("Button_Button__ra12g");
    private final By secondOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public By getFirstOrderButton() {
        return firstOrderButton;
    }

    public By getSecondOrderButton() {
        return secondOrderButton;
    }

    public MainPageObject clickDropdownButton() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='accordion__heading-" + dropDownElement + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }

    public void checkDropDownElementText() {
        boolean isDisplayed = driver.findElement(By.xpath(".//*[@id='accordion__panel-" + dropDownText + "']/p")).isDisplayed();
        assertTrue(isDisplayed);
        String elementText = driver.findElement(By.xpath(".//*[@id='accordion__panel-" + dropDownText + "']/p")).getText();
        assertEquals(expected, elementText);
    }
}

