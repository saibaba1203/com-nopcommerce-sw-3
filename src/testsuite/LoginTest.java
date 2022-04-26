package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public  void userShouldNavigateToLoginPageSuccessfully() {

        clickOnElement(By.linkText("Log in"));
        String expectedMessage = "Welcome, Please Sign In!";
        String actuleMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals("Not navigate to login page", expectedMessage, actuleMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        clickOnElement(By.linkText("Log in"));
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        sendTextToElement(By.id("Email"),"sanketdesai_2011@yahoo.com");
        sendTextToElement(By.name("Password"),"sanket123");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));
        String expectedMessage = "Log in";
        String actualMessage = getTextFromElement(By.xpath("//button[contains(text(),'Log in')]"));
        Assert.assertEquals("Log out", expectedMessage, actualMessage);
    }
    @Test
    public void verifyTheErrorMessage(){

        clickOnElement(By.linkText("Log in"));
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        sendTextToElement(By.id("Email"),"prime12@gmail.com");
        sendTextToElement(By.name("Password"),"Prime12");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again." +
                "The credentials provided are incorrect";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        Assert.assertEquals("ErrorMessage is not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}


