package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class E2ETest extends BasePage {

    @Test(priority=0)
    public void buyProductAccordingToCurrentTemp() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist  = new Moisturizers(driver);
        Sunscreens sun = new Sunscreens(driver);
        Cart cart = new Cart(driver);

        Assert.assertEquals(currentTemp.getTitle(), "Current Temperature");

        currentTemp.clickBuyMoisturizers();
        moist.clickAddFirstMoist();
        moist.goToCaret();
        cart.clickOnPayWithCardButton();
        cart.enterCardsDetailes();
        System.out.println("Run Test Success");
    }
}
