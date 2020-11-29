package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class locator1{


    @Test
    public void usingLocator() {
         System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

       String myTagName = "button";
        By createAccount = By.tagName(myTagName);
        WebElement createAccountButton = driver.findElement(createAccount);
        createAccountButton.click();

       // driver.findElement(By.tagName("button")).click();
       // driver.findElement(By.id("boldyrava,darya@gmail.com")).sendKeys("Boldyrava.darya@gmail.com");
        
       // emailElement.sendKeys("Boldyrava.darya@gmail.com");
        String createAccountText = "Create New Account";
        By createAccountLocator2 = By.linkText(createAccountText);
        WebElement element = driver.findElement(createAccountLocator2);
        element.click();

    }

}