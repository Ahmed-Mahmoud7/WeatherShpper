package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CurrentTemp;
import pages.Moisturizers;

public class MoisturizersTest extends BasePage {


    @Test(priority=0)
    public void validateCurrentTempPageTitle() {
         CurrentTemp currentTemp = new CurrentTemp(driver);
         Moisturizers  moist = new Moisturizers(driver);
         currentTemp.clickBuyMoisturizers();
         Assert.assertEquals(moist.getTitle(), "The Best Moisturizers in the World!");
         System.out.println("Test Run Success");
    }
}
