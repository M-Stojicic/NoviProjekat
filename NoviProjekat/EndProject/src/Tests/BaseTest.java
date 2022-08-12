package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup(){

        // System.setProperty("webdriver.gecko.driver", "C:\Users\pc\\OneDrive\\Desktop\\NoviProjekat\\EndProject\\lib\\geckodriver.exe");
        // driver = new FirefoxDriver();
        // driver.manage().window().maximize();
        // FirefoxOptions options = new FirefoxOptions();
        // options.setHeadless(true);
        // driver = new FirefoxDriver(options);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\OneDrive\\Desktop\\NoviProjekat\\NoviProjekat\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    
    }
    @After
    public void teardown(){
        driver.quit();
    }
    
}
