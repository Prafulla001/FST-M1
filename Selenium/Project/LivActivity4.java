package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LivActivity4 {
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

        //Find the PIM option in the menu and click it.

        //driver.findElement(By.id("btnAdd")).click();
        //driver.findElement(By.linkText("PIM"));
        //driver.findElement(By.linkText("PIM"));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();

        //click on add button to add employee details
        driver.findElement(By.id("btnAdd")).click();

        //Fill in the required employee fields name
        WebElement EmpFirstName = driver.findElement(By.id("firstName"));
        WebElement EmpLastName = driver.findElement(By.id("lastName"));

        //writing name using sendkeys..
        EmpFirstName.sendKeys("Pranav");
        EmpLastName.sendKeys("Kumar");

        //click save button to save employee details
        driver.findElement(By.id("btnSave")).click();

        //come back to PIM Page back
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();

        //search employee by name in employee list section

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]")).click();
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Pranav kumar");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset")).click();
        //EmpSearch1.sendKeys("Pranav");
        //WebElement EmpSearchNam = null;

        //searchName.sendKeys(Keys.ENTER);
        driver.findElement(By.id("searchBtn")).click();
        //driver.findElement(By.name("_search")).click();

        //isDisplayed() method returns boolean value either True or False
        Boolean Display = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[3]/a")).isDisplayed();
        //To print the value
        System.out.println("Element displayed is :"+Display);

        //Close the browser
        driver.quit();
    }
}