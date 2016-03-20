import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by SunKa on 3/17/16.
 */
public class GmailSpam {

    WebDriver driver;

    @Test
    public void test() {

        // Initializes and opens a FF browser on a blank page.
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();

        // Navigates to the specified web page
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifierhttps://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");

        WebElement element = driver.findElement(By.name("Email"));

        //Sends the following text to the control
        element.sendKeys("Alex.Galavach");

        // Send an 'Enter' key press command to the corresponding control
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        WebElement Passwd = driver.findElement(By.cssSelector("'#Passwd'"));
        WebElement Passwd = driver.findElement(By.xpath("//*[@id='Passwd']"));
        Passwd.sendKeys("RadaYana");
        driver.findElement(By.xpath("//*[@id='signIn']")).click();

  //      System.out.println();

//        Passwd.sendKeys(Keys.ENTER);



//
//
//        // Clear
//        element.clear();
//
//
//        element.sendKeys("Pizza delivery Weehawken платно с регистрацией и смс в плохом качестве оффлайн");
//
//
//        WebElement mostRecentRow = driver.findElement(By.cssSelector(".g .r a"));
//
//        // Click a corresponding element.
//        mostRecentRow.click();
//
//        // Closes a tab in the browser or closes the browser if tab is the last one.
//        driver.close();
//
//        // Closes the browser.
//        driver.quit();
    }

}
