package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CurrentTempTests extends BasePage {

    @Test(priority=0)
    public void validateCurrentTempPageTitle() {

        CurrentTemp currentTemp = new CurrentTemp(driver);
        Assert.assertEquals(currentTemp.getTitle(), "Current Temperature");
        logger.log(LogStatus.INFO, "Verify Page Title");
        System.out.println("Test Run Success");
    }

    @Test(priority=2)
    public void buyProductAccordingToCurrentTemp() {

        CurrentTemp currentTemp = new CurrentTemp(driver);
        currentTemp.selectProductAccordingToTemp();
        logger.log(LogStatus.INFO, "check temp and buy product");
        System.out.println("Test Run Success");
    }

    @Test(priority=1)
    public void validatePageElements() {

        CurrentTemp currentTemp = new CurrentTemp(driver);
        currentTemp.checkPageElementVisability();
        logger.log(LogStatus.INFO, "Elements already exist on the page ");
        System.out.println("Test Run Success");
    }
}
