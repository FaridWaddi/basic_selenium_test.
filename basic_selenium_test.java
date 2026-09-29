import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class basic_selenium_test {
    WebDriver driver;


    @Test (priority =  1)
    public void firstTest(){

        // Open Browser
        driver =  new ChromeDriver();
        // Navigates to website
        driver.get("https://www.wikipedia.org/");

        // Validates the title of the page.
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Wikipedia");

        // Closes the browser.
    }

}
