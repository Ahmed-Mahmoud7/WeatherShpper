package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CurrentTemp;
import pages.Moisturizers;

public class MoisturizersTest extends BasePage {


    @Test(priority=0)
    public void validateCurrentTempPageTitle() {

         Moisturizers  moist = new Moisturizers(driver);
         Assert.assertEquals(moist.getTitle(), "");
         System.out.println("Test Run Success");
    }
}
