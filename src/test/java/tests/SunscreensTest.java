package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Moisturizers;
import pages.Sunscreens;

public class SunscreensTest extends BasePage {

    @Test(priority=0)
    public void validateCurrentTempPageTitle() {

        Sunscreens sunscreen = new Sunscreens(driver);
        Assert.assertEquals(sunscreen.getTitle(), "");
        System.out.println("Test Run Success");
    }

}
