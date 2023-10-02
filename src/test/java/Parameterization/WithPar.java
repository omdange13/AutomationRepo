package Parameterization;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithPar {


    public static WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void BeforeMethdEG(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecho.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.Edge.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new EdgeDriver();

        } else {

            throw new RuntimeException("Please Select Correct Browser");

        }
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }

        @Parameters({"cityName","state"})
        @Test
        public void VerifyFGoogle(String cityName, String  state ) throws InterruptedException {

            WebElement webElement = driver.findElement(By.name("q"));
            webElement.sendKeys(cityName + state);
            webElement.sendKeys(Keys.ENTER);

            Thread.sleep(3000);
            driver.close();

        }
    }




