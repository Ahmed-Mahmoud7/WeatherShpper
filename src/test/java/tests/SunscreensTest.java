package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CurrentTemp;
import pages.Moisturizers;
import pages.Sunscreens;

public class SunscreensTest extends BasePage {

    @Test(priority=0)
    public void validateCurrentTempPageTitle() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Sunscreens sunscreen = new Sunscreens(driver);
        currentTemp.clickBuySunscreens();
        Assert.assertEquals(sunscreen.getTitle(), "The Best Sunscreens in the World!");
        System.out.println("Test Run Success");
    }

}
