package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Write down the following test into ‘ForgotPasswordTest’
class
1.
*
*
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        WebElement forgotPassword = driver.findElement(By.id("forgotPasswordLink"));
        forgotPassword.click();
        //Verify the text ‘Forgot Your Password?’
        Assert.assertEquals("Incorrect detail","Forgot your password?",forgotPassword.getText());
    }
    @After
    public void tearDown() {
        //closeBrowsers();
    }
}
