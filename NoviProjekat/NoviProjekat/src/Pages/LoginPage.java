package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    
    public LoginPage (WebDriver driver){
        super(driver);
    }


    String baseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    By logoutMenuItem = By.className("logout");
    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");
    By loginTitle = By.className("page-heading");
    By errorContainer = By.xpath("//*[@id='center_column']/div[1]/ol/li");


    public LoginPage basePage(){
        driver.get(baseURL);
        return this;
    }

    public LoginPage login(String username, String password){
        writeText(emailBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    public LoginPage verifySuccesfullLogin(String expectedText){
        String actualText = readText(loginTitle);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public LoginPage verifyUnsuccesfullLogin(String expectedText){
        String actualText = readText(errorContainer);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public LoginPage clickLoginMenuItem(){
        click(logoutMenuItem);
        return this;
    }

    public LoginPage verifySuccesfullLogout(String expextedText){
        String actualText = readText(loginTitle);
        assertTextEquals(actualText, actualText);
        return this;
    }
    
    




}

   
    
    