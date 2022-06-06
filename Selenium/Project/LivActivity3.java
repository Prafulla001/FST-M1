package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LivActivity3 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Title of Website is: " + title);

        //Find username and password fields
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));

        //Type credentials
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");

        //Click on LOGIN button
        driver.findElement(By.id("btnLogin")).click();

        //Verify that the homepage has opened.. user in its Dashboard with welcome profile
        String verifyHomepage = driver.findElement(By.id("welcome")).getText();
        System.out.println("User is successfully Login to its Dashboard: " + verifyHomepage);


        //Close the browser
        driver.quit();
    }
}