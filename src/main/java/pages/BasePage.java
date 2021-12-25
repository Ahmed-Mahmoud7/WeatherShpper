package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestContext;

public class BasePage {

    public static WebDriver driver;
    String url = "http://weathershopper.pythonanywhere.com/.";
    public static ExtentTest logger;
    public static ExtentReports report;


    @Parameters("browserName")
    @BeforeMethod(alwaysRun=true)
    public void setup(String browserName, ITestContext context) {
        
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // This suppresses the Severe Timed out receiving messages
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            context.setAttribute("WebDriver", driver);

        } else if (browserName.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(url);
            context.setAttribute("WebDriver", driver);

        }

    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        driver.quit();
    }
}
