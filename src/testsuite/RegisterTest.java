package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        clickOnElement(By.linkText("Register"));
        String expectedMessage = "Register";
        String actuleMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
        Assert.assertEquals("Not navigate to Register page", expectedMessage, actuleMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        clickOnElement(By.linkText("Register"));
        clickOnElement(By.xpath("//input[@id='gender-male']"));
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"sanket1");
        sendTextToElement(By.xpath("//input[@id='LastName']"),"desai");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"16");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"January");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1983");
        sendTextToElement(By.xpath("//input[@id='Email']"),"sanketdesai_2011@yahoo.com");
        sendTextToElement(By.xpath("//input[@id='Password']"),"sanket123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"sanket123");
        clickOnElement(By.xpath("//button[@id='register-button']"));
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals("Registration page is not displayed", expectedMessage, actualMessage);

    }
@After
    public void closeBrowser(){

}
}

