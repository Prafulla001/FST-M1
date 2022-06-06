package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Objects;

public class LivActivity2 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Title of Website is: " + title);

        //Display no. of Images on the page
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        System.out.println("No of Images on page: " +listImages.size());

        //Display all url of Images of the page
        for (WebElement listImage : listImages) {
            if (!(listImage.getAttribute("src").equals("")) && !(Objects.equals(listImage.getAttribute("src"), null))) {
                System.out.println(listImage.getAttribute("src"));
            }
        }


        //WebElement idLocator = driver.findElement(By.id("divLogo"));
        //System.out.println("URL of Image is:--> " + idLocator.getText());
        //WebElement idLocator = driver.findElement(By.xpath ("/html/body/div[1]/div/div[2]/div[1]/img"));
        //System.out.println("URL of Image is:--> " + idLocator.getText());



        //Close the browser
        driver.quit();
    }
}