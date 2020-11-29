package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class homeWork5 {
    @Test
            public void testCase()  {
    System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver");
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");

   WebElement bellIcon = driver.findElement(By.id("ybarNotificationMenu"));
        Actions act = new Actions(driver);
        act.moveToElement(bellIcon).build().perform();
        act.click(bellIcon).build().perform();


        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.facebook.com");



        String createAccountText = "Create New Account";
        By createAccountLocator2 = By.linkText(createAccountText);
        WebElement element = driver1.findElement(createAccountLocator2);
        element.click();

        String findName = "First name";
        By inputN = By.linkText(findName);
        WebElement inputName = driver.findElement(By.id("First name"));
        inputName.findElement(By.xpath(" //*[@id=\"u_1_b\"]")).sendKeys("fName");

    }
}
