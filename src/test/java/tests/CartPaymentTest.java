package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartPaymentTest extends BasePage {

    @Test(priority=0)
    public void validateCurrentTempPageTitle() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist = new Moisturizers(driver);
        Cart cart = new Cart(driver);
        currentTemp.clickBuyMoisturizers();
        moist.clickAddFirstMoist();
        moist.goToCaret();
        Assert.assertEquals(cart.getTitle(), "Cart Items");
        logger.log(LogStatus.INFO, "Verify page Title");
        System.out.println("Test Run Success");
    }

    @Test(priority=1)
    public void validateToOpenPaymentStripePopUP() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist = new Moisturizers(driver);
        Cart cart = new Cart(driver);
        currentTemp.clickBuyMoisturizers();
        moist.clickAddFirstMoist();
        moist.goToCaret();
        cart.checkPaymentButtonIsExist();
        cart.clickOnPayWithCardButton();
        logger.log(LogStatus.INFO, "Payment PopUp Opened");
        System.out.println("Test Run Success");
    }

    @Test(priority=1)
    public void validatePaymentProcess() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist = new Moisturizers(driver);
        Cart cart = new Cart(driver);
        currentTemp.clickBuyMoisturizers();
        moist.clickAddFirstMoist();
        moist.goToCaret();
        cart.checkPaymentButtonIsExist();
        cart.clickOnPayWithCardButton();
        cart.enterCardsDetailes();
        logger.log(LogStatus.INFO, "Payment done");
        System.out.println("Test Run Success");
    }
}
