//package GmailPages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GmailSpam {

    WebDriver driver;
    WebDriver driver2;

    @Test
    public void sendSpamEmail() {

        driver = new ChromeDriver();

   //     gmailLogin ("Alex.Galavach", driver);

///////////// Login class or method ////////////////

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

///////////// End of Login class or method ////////////


///////////// Compose new email ////////////////////////

        // this one also works, why it's wrong?
       // driver.findElement(By.xpath("//*[@id=\":5b\"]/div/div")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();

        // add Email address
       // WebElement email = driver.findElement(By.xpath("//*[@id=':a8']"));
        WebElement email = driver.findElement(By.name("to"));
        //*[@id=":a3"]
        email.sendKeys("Alexander.Galavach@gmail.com");
// add Subject
        WebElement emailSubject = driver.findElement(By.name("subjectbox"));
        ////*[@id=":8e"]
        emailSubject.sendKeys("Test spam message");
// add Text
   //     WebElement emailText = driver.findElement(By.xpath("//*[@id=':ax']"));
        WebElement emailText = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        emailText.sendKeys("Test spam text");
// send Email
        //driver.findElement(By.xpath("//*[@id=':9i']")).click();
        driver.findElement(By.xpath("//div[contains(@data-tooltip, 'Send')]")).click();



        ///////////// COPY_OF_ Login class or method ////////////////

        // Navigates to the specified web page
        driver2 = new ChromeDriver();
        driver2.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifierhttps://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");

        WebElement element2 = driver2.findElement(By.name("Email"));

        //Sends the following text to the control
        element2.sendKeys("Alexander.Galavach");

        // Send an 'Enter' key press command to the corresponding control
        element2.sendKeys(Keys.ENTER);
        driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        WebElement Passwd = driver.findElement(By.cssSelector("'#Passwd'"));
        WebElement Passwd2 = driver2.findElement(By.xpath("//*[@id='Passwd']"));
        Passwd2.sendKeys("RadaYana");
        driver2.findElement(By.xpath("//*[@id='signIn']")).click();

///////////// End of COPY_OF Login class or method ////////////


////////check mail from User1 & mark it as Smam

       // driver2.findElement(By.xpath("//*[@email='alex.galavach@gmail.com']")).click();
       // driver2.findElement(By.cssSelector("'#alex.galavach@gmail.com'")).click();
       driver2.findElement(By.xpath("//*[@id=':3o']/div")).click();
       // driver2.findElement(By.xpath("//div[@class='oZ-jc T-Jo J-J5-Ji']")).click();
        //driver2.findElement(By.xpath("//*[@id=':5']/div/div[1]/div[1]/div/div/div[2]/div[2]")).click();
        driver2.findElement(By.xpath("//div[@class='asl T-I-J3 J-J5-Ji']")).click();

//*[@id=":3o"]/div

//////////// Send second mail - to do as a separate method or class ////

        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();

        // add Email address
        // WebElement email = driver.findElement(By.xpath("//*[@id=':a8']"));
        WebElement email2 = driver.findElement(By.name("to"));
        //*[@id=":a3"]
        email2.sendKeys("Alexander.Galavach@gmail.com");
// add Subject
        WebElement emailSubject2 = driver.findElement(By.name("subjectbox"));
        ////*[@id=":8e"]
        emailSubject2.sendKeys("Test spam message2");
// add Text
        WebElement emailText2 = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        emailText2.sendKeys("Test spam text 2");
// send Email
        //driver.findElement(By.xpath("//*[@id=':9i']")).click();
        driver.findElement(By.xpath("//div[contains(@data-tooltip, 'Send')]")).click();

/////// Mark Second mail as Spam - to do as a method /////

        driver2.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver2.get("https://mail.google.com/mail/#inbox");
        driver2.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver2.get("https://mail.google.com/mail/#inbox");
        driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver2.findElement(By.xpath("//*[@id=':3o']/div")).click();
        driver2.findElement(By.xpath("//div[@class='asl T-I-J3 J-J5-Ji']")).click();

///////////////// Send third mail //////
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        // add Email address
        // WebElement email = driver.findElement(By.xpath("//*[@id=':a8']"));
        WebElement email3 = driver.findElement(By.name("to"));
        //*[@id=":a3"]
        email3.sendKeys("Alexander.Galavach@gmail.com");
// add Subject
        WebElement emailSubject3 = driver.findElement(By.name("subjectbox"));
        ////*[@id=":8e"]
        emailSubject3.sendKeys("Test spam message3");
// add Text
        WebElement emailText3 = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        emailText3.sendKeys("Test spam text 3");
// send Email
        //driver.findElement(By.xpath("//*[@id=':9i']")).click();
        driver.findElement(By.xpath("//div[contains(@data-tooltip, 'Send')]")).click();

/////// Check spam mail  ////

        driver2.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver2.get("https://mail.google.com/mail/#spam");
        driver2.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver2.get("https://mail.google.com/mail/#spam");
        driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

////// Check that third mail in Spam ////
        if (driver.findElements( By.id("//span[contains(., 'Test spam message3')]") ).size() == 0)

// NEXT message put instead of exception while Spam defect is not fixed
//            System.out.println("Spam filter doesn't work!");
            throw new IllegalArgumentException("Spam filter doesn't work!");
        else System.out.println("Spam filter works!");

//////// Closure procedures - TBD /////////
        //driver2.findElement(By.xpath("//span[@class='T-Jo J-J5-Ji T-Jo-auq T-Jo-aMF']")).click();
        //driver2.findElement(By.xpath("//*[@id=':5o']/div[1]/span/div")).click();
        //driver.findElement(By.xpath("//div[contains(@data-tooltip, 'Select')]")).click();
       // WebElement Passwd = driver.findElement(By.cssSelector("'#3a 2l > div.J-J5-Ji.J-JN-M-I-Jm > span > div'"));
        //#\3a 2l > div.J-J5-Ji.J-JN-M-I-Jm > span > div

//        driver2.findElement(By.xpath("//div[@class='T-I J-J5-Ji aFk T-I-ax7 ar7 T-I-Zf-aw2']")).click();
//        driver2.get("https://mail.google.com/mail/#inbox");
//        driver2.findElement(By.xpath("//*[@id=':3g']/div[1]/span/div")).click();
//        driver2.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
//
//        // Closes a tab in the browser or closes the browser if tab is the last one.
//        driver.close();
//        // Closes the browser.
//        driver.quit();
//        // Closes a tab in the browser or closes the browser if tab is the last one.
//        driver2.close();
//        // Closes the browser.
//        driver2.quit();

    }
}
