package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LivActivity5 {
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

        //click on MyInfo section on header part to edit info details (worked)
        driver.findElement(By.linkText("My Info")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();

        //click by action method............(not)
        //WebElement InfoClick = driver.findElement(By.id("menu_pim_viewMyDetails"));
        //WebElement InfoClick = driver.findElement(By.linkText("My Info"));
        // object of Actions with method moveToElement
        //Actions a = new Actions(driver);
        //a.moveToElement(InfoClick).perform();
        //identify sub-menu element
        //WebElement m=driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b"));
        //move to element and click
        //a.moveToElement(m).click().perform();

        //Click on Edit Button under My Info page
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p")).click();
        driver.findElement(By.id("btnSave")).click();

        //clear() method clears the content of a editable box first name
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Raj1");

        //clear() method clears the content of a editable box last name
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("kum1");

        //select gender
        driver.findElement(By.id("personal_optGender_1")).click();

        //select nationality by dropdown........
        // Create object of the Select class
        Select NationSelect = new Select(driver.findElement(By.id("personal_cmbNation")));
        // Select the option by index
        NationSelect.selectByIndex(82);

        //fill DOB
        driver.findElement(By.id("personal_DOB")).clear();
        driver.findElement(By.id("personal_DOB")).sendKeys("2011-05-10");

        //click on date outside box- TO WORK ON DATEPICKER
        //driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[3]/td[2]/a"));


        //Close the browser
        //driver.quit();
    }
}