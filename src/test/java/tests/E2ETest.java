package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class E2ETest extends BasePage {

    @Test(priority=0)
    public void validateToBuyMoisturizeAsCustomer() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist  = new Moisturizers(driver);
        Sunscreens sun = new Sunscreens(driver);
        Cart cart = new Cart(driver);

    }


    @Test(priority=1)
    public void validateToBuySunscreenAsCustomer() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist  = new Moisturizers(driver);
        Sunscreens sun = new Sunscreens(driver);
        Cart cart = new Cart(driver);

    }
}
