import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Properties;

// Web driver and Path Configuration
public class BasePageTest {
    private static WebDriver driver;
    private static final String CONFIG_PATH =System.getProperty("user.dir") +"\\src\\config.properties";
    private static Properties prop;

    // Website url open for login
    @BeforeClass
    public void init() {
        System.out.println(CONFIG_PATH);
        prop = loadProperties();
//

        // If user want to use headless browser to execution the script the activate the below script
/*
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--enable-automation");
        options.addArguments("--headless");
        options.addArguments("window-size=1920,1080");
        options.addArguments("no-sandbox");
        options.addArguments("disable-extension");
        options.addArguments("dns-prefetch-disable");
        options.addArguments("disable-gpu");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
*/


        //  It is the setting for the normal execution of the script by using normal browser(GUI).
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
          else if (browserName.equals("opera")){
            WebDriverManager.operadriver().setup();
            driver=new OperaDriver();
        }else{
              WebDriverManager.safaridriver().setup();
              driver=new SafariDriver();
        }
            driver.manage().window().maximize();
            driver.get(prop.getProperty("baseUrl"));
        }

    // Read All external Properties File.
    public Properties loadProperties() {
        File file = new File(CONFIG_PATH);

        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties prop = new Properties();
        try {
            prop.load(fin);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
/*
    // Browser Tear Down to close window
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
*/

    // Web Driver Method
    public WebDriver getDriver() {
        return driver;
    }


    // Return Properties
    public Properties getProp() {
        return prop;
    }
}






