package Tests;

import java.text.ParseException;

import org.junit.Test;
import Pages.ShoppingPage;

public class ShoppingTests extends BaseTest{

    public ShoppingPage shoppingPage;

    @Test
    public void verifySuccesfullAddToCart() throws ParseException{
        shoppingPage = new ShoppingPage(driver);
        shoppingPage.basePage();
        shoppingPage.clickOnProduct();
        shoppingPage.clickOnAddToCartButton();
        shoppingPage.checkPrice();

        try{
            Thread.sleep(7000);
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    


}