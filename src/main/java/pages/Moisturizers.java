package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Moisturizers {

    By addFirstMoisturizeButton =  By.xpath("(//button[contains(.,'Add')])[4]");
    By addSecondMoisturizeButton = By.xpath("");
    By cartIcon =  By.xpath("//button[@onclick='goToCart()'][contains(.,'Cart - 1 item(s)')]");



    WebDriver driver;
    WebDriverWait wait;

    public Moisturizers(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 5);
    }

    public String getTitle() {
        return driver.getTitle();
    }


    public void clickAddFirstMoist () {
        driver.findElement(addFirstMoisturizeButton).click();
    }

    public void clickAddSecondMoist () {
        driver.findElement(addFirstMoisturizeButton).click();
    }

    public void goToCaret () {
        driver.findElement(cartIcon).click();
    }
}
