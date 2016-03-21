/*
package GmailPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class GmailLogin {

    public void gmailLogin (String emailAddress, WebDriver driver) {


        // Navigates to the specified web page
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifierhttps://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");

        WebElement element = driver.findElement(By.name("Email"));

        //Sends the following text to the control
        element.sendKeys("Alex.Galavach");

        // Send an 'Enter' key press command to the corresponding control
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        WebElement Passwd = driver.findElement(By.cssSelector("'#Passwd'"));
        WebElement Passwd = driver.findElement(By.xpath("/*/
/*[@id='Passwd']"));
        Passwd.sendKeys("RadaYana");
        driver.findElement(By.xpath("/*/
/*[@id='signIn']")).click();
    }


}
*/
