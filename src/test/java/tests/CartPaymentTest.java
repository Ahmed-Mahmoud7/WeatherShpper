package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Cart;
import pages.Sunscreens;

public class CartPaymentTest extends BasePage {

    @Test(priority=0)
    public void validateCurrentTempPageTitle() {

        Cart cart = new Cart(driver);
        Assert.assertEquals(cart.getTitle(), "");
        System.out.println("Test Run Success");
    }
}
