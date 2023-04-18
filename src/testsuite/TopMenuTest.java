package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {  //Extended Class
    String baseUrl = "https://demo.nopcommerce.com/"; // Webpage Url

    @Before

    public void setUp(){
        openBrowser(baseUrl);
    } // Set Up for Open Browser
    @Test

    public void userShouldNavigateToComputerPageSuccessfully(){
        // Click on Computer
        WebElement computers = driver.findElement(By.xpath("//a[text()='Computers ']"));
        computers.click();

        // Verify the Computer page display
        String expectedTitle = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Computers Title", expectedTitle,actualTitle);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // Click on Electronics
        WebElement electronics = driver.findElement(By.xpath("//a[text()='Electronics ']"));
        electronics.click();

        // Verify the Electronics page display
        String expectedTitle = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Electronics Title",expectedTitle,actualTitle);
        
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Click on Apparel
        WebElement apparel = driver.findElement(By.xpath("//a[text()='Apparel ']"));
        apparel.click();
        // Verify the apparel page display
        String expectedTitle = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Apparel Title", expectedTitle, actualTitle);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // click on DigitalDownLoads
        WebElement digitalDownloads = driver.findElement(By.xpath("//a[text()='Digital downloads ']"));
        digitalDownloads.click();
        // Verify the DigitalDownloads page display
        String expectedTitle = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Digital downloads Title", expectedTitle, actualTitle);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Click on Books
        WebElement books = driver.findElement(By.xpath("//a[text()='Books ']"));
        books.click();
        // Verify the Books page is display
        String expectedTitle = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Books Title", expectedTitle, actualTitle);
    }
    @Test
            public void userShouldNavigateToJewelryPageSuccessfully() {
        // // Click on Jewelry
        WebElement jewelry = driver.findElement(By.xpath("//a[text()='Jewelry ']"));
        jewelry.click();
        // Verify the Jewelry page is display
        String expectedTitle = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Jewelry Title", expectedTitle, actualTitle);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // Click on GiftCards
        WebElement giftCards = driver.findElement(By.xpath("//a[text()='Gift Cards ']"));
        giftCards.click();
        // Verify the GiftCard page is display
        String expectedTitle = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Gift Cards Title", expectedTitle, actualTitle);
        driver.close();
    }

}
