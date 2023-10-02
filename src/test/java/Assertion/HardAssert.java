package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

    @Test
    public void TestcaseA() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();


        Assert.assertEquals(driver.getTitle(),"Rediffmail", "Title should be match");

        driver.close();
    }
}
