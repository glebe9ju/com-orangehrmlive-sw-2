package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Enter “Admin” username
        WebElement adminUsername = driver.findElement(By.name("txtUsername"));
        adminUsername.sendKeys("Admin");
        //Enter “admin123 password
        WebElement adminPassword = driver.findElement(By.name("txtPassword"));
        adminPassword.sendKeys("admin123");
        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement welcome = driver.findElement(By.id("welcome"));
        //Verify the ‘Welcome’ text is display
        Assert.assertEquals("Incorrect Login Detail","Welcome Paul",welcome.getText());

    }
    @After
    public void tearDown() {
        //closeBrowsers();
    }

}
