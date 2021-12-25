package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sunscreens {

    By addFirstSunscreenButton =  By.xpath("(//button[contains(.,'Add')])[4]");
    By addSecondSunscreenButton = By.xpath("//span[@class='_45mg'][contains(text(), 'Checkout')]");
    By cartIcon =  By.xpath("//button[@onclick='goToCart()'][contains(.,'Cart - 1 item(s)')]");



    WebDriver driver;
    WebDriverWait wait;

    public Sunscreens(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 5);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickAddFirstSunscreen () {
        driver.findElement(addFirstSunscreenButton).click();
    }

    public void clickAddSecondSunscreen () {
        driver.findElement(addSecondSunscreenButton).click();
    }

    public void goToCaret () {
        driver.findElement(cartIcon).click();
    }
}
