package Activities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LivActivity1 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Verify the website title.........
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Perform testing and assertions
        //Check the title of the page
        String title1 = driver.getTitle();
        driver.manage().window().maximize();
        String title2 = "OrangeHRM";
        if(title1.equalsIgnoreCase(title2))
            System.out.println("Title Matched");
        else
            System.out.println("Title not Matched//Pls check once");

        //Print the title of the page
        //System.out.println("Title of Website is: " + title1);


        //Close the browser
        driver.quit();
    }
}