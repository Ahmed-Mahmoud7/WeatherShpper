package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CurrentTempTests extends BasePage {

    @Test(priority=0)
    public void validateCurrentTempPageTitle() {

        CurrentTemp currentTemp = new CurrentTemp(driver);
        Assert.assertEquals(currentTemp.getTitle(), "Current Temperature");
        System.out.println("Test Run Success");
    }

    @Test(priority=2)
    public void buyProductAccordingToCurrentTemp() {

        CurrentTemp currentTemp = new CurrentTemp(driver);
        currentTemp.selectProductAccordingToTemp();
        System.out.println("Test Run Success");
    }

    @Test(priority=1)
    public void validatePageElements() {

        CurrentTemp currentTemp = new CurrentTemp(driver);
        currentTemp.checkPageElementVisability();
        System.out.println("Test Run Success");
    }
}
