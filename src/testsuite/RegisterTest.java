package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest { //Extended Class
    String baseUrl = "https://demo.nopcommerce.com/"; // Webpage Url

    @Before
    public void setUp() {  //Set Up for Open Browser
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        // Click on Register Link
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        // Verify the Actual Message
        String expectedTitle = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String  actualTitle = actualTextElement.getText();
        Assert.assertEquals("Display Computers Title", expectedTitle,actualTitle);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        // Click on Register tab
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        // Select the Gender Radio Button
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-female']"));
        gender.sendKeys("Female");
        // Input the FirstNameField
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstNameField.sendKeys("Keren");
        // Input the LastName Field
        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastNameField.sendKeys("Smith");
        // Select Date on DateOfBirth
        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        day.sendKeys("15");
        // Select a Month
        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        month.sendKeys("May");
        // Select a Year
        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("1990");
        // Input EmailField
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("1743cherry@yahoo.com");
        // Input PasswordField
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordField.sendKeys("123meds");
        // Confirm the ConfirmPassword Field
        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPasswordField.sendKeys("123meds");
        // Click on Register Button
        WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
        registerButton.click();

        // Verify the Actual Message
        String expectedMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(" Message displayed", expectedMessage,actualMessage);
        driver.close();

    }
}