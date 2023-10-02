package Parameterization;

import com.beust.jcommander.Parameter;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameter {

    @Parameters({"cityName","state"})
    @Test
    public void VerifyFGoogle(String cityName, String  state ) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement webElement = driver.findElement(By.name("q"));
        webElement.sendKeys(cityName + state);
        webElement.sendKeys(Keys.ENTER);


        Thread.sleep(3000);
        driver.close();

    }
}
