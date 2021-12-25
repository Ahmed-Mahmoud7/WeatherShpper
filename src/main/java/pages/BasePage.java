package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestContext;

public class BasePage {

    public static WebDriver driver;
    String url = "http://weathershopper.pythonanywhere.com/.";

    @BeforeMethod(alwaysRun=true)
    public void setup(ITestContext context) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // This suppresses the Severe Timed out receiving messages
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        context.setAttribute("WebDriver", driver);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        driver.quit();
    }
}
