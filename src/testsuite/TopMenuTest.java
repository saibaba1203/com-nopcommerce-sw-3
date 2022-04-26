package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public  void userShouldNavigateToComputerPageSuccessfully(){
        clickOnElement(By.linkText("Computers"));
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals("Computers page is not displayed", expectedMessage, actualMessage);
    }
    @Test
    public  void userShouldNavigateToElectronicsPageSuccessfully(){

        clickOnElement(By.linkText("Electronics"));
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        Assert.assertEquals("Electronics page is not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        clickOnElement(By.linkText("Apparel"));
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        Assert.assertEquals("Apparel page is not displayed", expectedMessage, actualMessage);
    }

        @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
            clickOnElement(By.linkText("Digital downloads"));
            String expectedMessage = "Digital downloads";
            String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
            Assert.assertEquals("Digital downloads page is not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        clickOnElement(By.linkText("Books"));
        String expectedMessage = "Books";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));
        Assert.assertEquals("Books page is not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        clickOnElement(By.linkText("Jewelry"));
        String expectedMessage = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        Assert.assertEquals("Jewelry page is not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        clickOnElement(By.linkText("Gift Cards"));
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        Assert.assertEquals("Gift Cards page is not displayed", expectedMessage, actualMessage);
    }
@After
    public void closeBrowser(){
        
}
}


