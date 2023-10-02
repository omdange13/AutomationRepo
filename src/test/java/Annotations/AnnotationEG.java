package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationEG {


    public static  WebDriver driver;
    @BeforeMethod
    public void BeforeMethosRG() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();

    }

    @Test
    public void Testcase1() {

        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

    }

    @Test
    public void Testcase2() {

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void Testcase3() {


        driver.get("https://omdange13.atlassian.net/browse/CCP-5");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void AfterMethodEG() {

        driver.close();
    }

}


