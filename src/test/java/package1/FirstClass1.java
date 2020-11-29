package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.*;


public class FirstClass1 {

 @Test
  public void lunchPage1() {
System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver");

     WebDriver driver = new ChromeDriver();

     driver.get("https://www.facebook.com");


driver.navigate().to("https://www.facebook.com");
driver.manage().window().fullscreen();
String pageTitle = driver.getTitle();
     System.out.println("Page Title" + pageTitle);
     try {
         sleep(7000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     driver.quit();

 }
}
