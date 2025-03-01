package Activities;


import com.beust.jcommander.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        //wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    //@Parameters({"susername", "spassword"})
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement susernameField = driver.findElement(By.id("username"));
        WebElement spasswordField = driver.findElement(By.id("password"));

        //Enter values
        susernameField.sendKeys(username);
        spasswordField.sendKeys(password);

        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}