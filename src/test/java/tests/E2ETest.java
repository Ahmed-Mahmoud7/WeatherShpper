package tests;


import com.relevantcodes.extentreports.LogStatus;
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
        currentTemp.clickBuyMoisturizers();
        moist.clickAddFirstMoist();
        moist.goToCaret();
        cart.checkPaymentButtonIsExist();
        cart.clickOnPayWithCardButton();
        cart.enterCardsDetailes();
        logger.log(LogStatus.INFO, "buy a moisturize");
        System.out.println("Test Run Success");

    }


    @Test(priority=1)
    public void validateToBuySunscreenAsCustomer() {
        CurrentTemp currentTemp = new CurrentTemp(driver);
        Moisturizers moist  = new Moisturizers(driver);
        Sunscreens sun = new Sunscreens(driver);
        Cart cart = new Cart(driver);
        currentTemp.clickBuySunscreens();
        sun.clickAddFirstSunscreen();
        sun.goToCaret();
        cart.checkPaymentButtonIsExist();
        cart.clickOnPayWithCardButton();
        cart.enterCardsDetailes();
        logger.log(LogStatus.INFO, "buy a sunscreen");
        System.out.println("Test Run Success");

    }
}
