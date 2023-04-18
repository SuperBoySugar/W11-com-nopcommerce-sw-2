package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest { //Extended Class
    String baseUrl = "https://demo.nopcommerce.com/"; //Webpage Url

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    } //Set Up for Open Browser

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Click on Login link
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();

        //Verify the Actual Message
        String expectMessage = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();
        // Input Email Field
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("123@gmail.com");
        // Input Password Field
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordField.sendKeys("password123");
        // Click on Login Button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();
        // Verify the Actual Message
        String expectedMessage = "Log out";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not redirect to logout page", expectedMessage, actualMessage);
    }
    @Test
    public void verifyTheErrorMessage() {
        // Click on Log In Link
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();
        // Input EmailField
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("56436@gmail.com");
        // Input PasswordField
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12password");
        // Click On Login Button
        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginBtn.click();
        // Verify the Actual Message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message display", expectedMessage, actualMessage);
        driver.close();
    }
}
