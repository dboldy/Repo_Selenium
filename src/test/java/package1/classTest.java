package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String clickButton = "Log in";
        By findButton = By.tagName(clickButton);
        WebElement selectButton = driver.findElement(findButton);
        selectButton.click();

    }
}