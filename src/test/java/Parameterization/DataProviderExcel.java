package Parameterization;

import com.google.common.collect.Table;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataProviderExcel {

    public static WebDriver driver;

    @DataProvider(name = "Test")
    public Object[][] dataProviderFuntion() throws  FileNotFoundException {
        Object[][] arrObj = getExcelData("C:\\Users\\Shree\\Downloads\\ExcelDataProvider.xlsx","Sheet1");
        return arrObj;
    }

    public String getExcelData(String filePath, String sheetName) throws  FileNotFoundException {

        String[][] Test = null;
        //try {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook xs = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = xs.getSheet(sheetName);
        XSSFRow XF = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCol = XF.getLastCellNum();

        Cell cell;

        Test = new String[noOfRows-1][noOfCol];

        for(int i=1; i<noOfRows;i++){

            for (int j=0; j<noOfCol;j++){
                XF=sheet.getRow(i);
                cell=XF.getCell(j);
            }
        }
    }
        //}catch (FileNotFoundException e){
        //   throw new RuntimeException();


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


    @Test(dataProvider = "Test")
    public void VerifyFGoogle(String cityName, String state) throws InterruptedException {

        WebElement webElement = driver.findElement(By.name("q"));
        webElement.sendKeys(cityName + state);
        webElement.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.close();

    }
}


