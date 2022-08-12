package Tests;

import org.junit.Test;

import Pages.LoginPage;

public class LoginTest extends BaseTest{
    public LoginPage loginPage;
    String email = "c.maki83@gmail.com";
    String emptyEmail = "";
    String password = "AniMatke1";
    String wrongPassword = "WrongPassword";
    String errorTextEmptyMail = "An email address required.";
    String errorTextWrongPassword = "Authentication failed.";

    @Test
    public void verifyUnsuccesfullLoginEmptyMail(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emptyEmail, password);
        loginPage.verifyUnsuccesfullLogin(errorTextEmptyMail);

        try{
            Thread.sleep(7000);
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void verifyUnsuccesfullLoginWrongPassword(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(email, wrongPassword);
        loginPage.verifyUnsuccesfullLogin(errorTextWrongPassword);

        try{
            Thread.sleep(7000);
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void loginTest(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(email, password);
        loginPage.verifySuccesfullLogin("MY ACCOUNT");
        loginPage.clickLoginMenuItem();
        loginPage.verifySuccesfullLogout("AUTENTICATION");

        try{
            Thread.sleep(7000);
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    


    
    
}



        

   

    
