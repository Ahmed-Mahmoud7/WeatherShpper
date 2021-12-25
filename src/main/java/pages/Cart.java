package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

    By payWithCardButton = By.xpath("//span[contains(.,'Pay with Card')]");
    By emailField = By.xpath("//*[@id=\"email\"]");
    By cardNumberField = By.xpath("//*[@id=\"card_number\"]");
    By expirationDateField = By.xpath("//*[@id=\"cc-exp\"]");
    By cvcField = By.xpath("//*[@id=\"cc-csc\"]");
    By payButton = By.xpath("//*[@id=\"submitButton\"]");


    WebDriver driver;
    WebDriverWait wait;

    public Cart(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 5);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickOnPayWithCardButton () {
        wait.until(ExpectedConditions.elementToBeClickable(payWithCardButton));
        driver.findElement(payWithCardButton).click();
    }

    public void enterCardsDetailes () {
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys("ahmed@test.com");
        driver.findElement(cardNumberField).sendKeys("4242424242424242");
        driver.findElement(expirationDateField).sendKeys("22022");
        driver.findElement(cvcField).sendKeys("345");
        driver.findElement(payButton).submit();
    }
}
