package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertt {

    @Test
    public void TestcaseA() {

        SoftAssert softassert =  new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();


        softassert.assertEquals(driver.getTitle(),"Rediffmail", "Title should be match");
        softassert.assertAll();
        driver.close();
    }
}
