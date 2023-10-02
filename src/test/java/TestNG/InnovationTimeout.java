package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InnovationTimeout {

    @Test(invocationTimeOut  = 100)
    public void TestcaseZ(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.close();
    }
    @Test(priority = -1, invocationTimeOut = 200)
    public void TestcaseA() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        driver.close();
    }
    @Test(priority = -99, invocationTimeOut =300 )
    public void TestcaseY() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omdange13.atlassian.net/browse/CCP-5");
        driver.manage().window().maximize();

        driver.close();
    }
    @Test(priority = 10,invocationTimeOut = 100)
    public void TestcaseB() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}
