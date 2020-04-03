import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class TestArgos {
    WebDriver driver;
    String browser;
    HomePage homePage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        browser = "https://www.argos.co.uk/";
        driver.get(browser);
        System.out.println(" i am on:" + browser);
        homePage=new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
    homePage.clickSearchBox();
    homePage.productSearchBox("puma");
    homePage.clickSearchButton();
    homePage.selectPrice();
    homePage.selectCustomerReview();
    homePage.clickChoseItem();
    homePage.enterPostCode("TW3 3ST");
    homePage.clickSubmitButton();
    homePage.addToTrolley();
    homePage.carryOnShopping();

    }
    @After
    public void quit(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.quit();
    }
}

