package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurrentTemp {

    By tempScreen = By.xpath("//span[@id='temperature']");
    By buyMoisturizersButton = By.xpath("//button[contains(text(),'Buy moisturizers')]");
    By buySunscreensButton = By.xpath("//button[contains(text(),'Buy sunscreens')]");


    WebDriver driver;
    WebDriverWait wait;

    public CurrentTemp(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 15);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickBuyMoisturizers() {
        driver.findElement(buyMoisturizersButton).click();


    }

    public void clickBuySunscreens() {
        driver.findElement(buySunscreensButton).click();

    }

    public void checkPageElementVisability() {
        driver.findElement(buySunscreensButton).isDisplayed();
        driver.findElement(buyMoisturizersButton).isDisplayed();
        driver.findElement(tempScreen).isDisplayed();

    }

    public void selectProductAccordingToTemp() {
        String temp = driver.findElement(tempScreen).getText();
        System.out.println(temp);
        //int currentWeather =Integer.parseInt(tempScreen);
        if ( temp == "19" ) {
            clickBuyMoisturizers();
        } else if (temp == "34") {
           clickBuySunscreens();
        } else {
            clickBuyMoisturizers();
       }



    }



}
