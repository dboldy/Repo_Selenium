package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumHw {

        @Test
      public void WeatherApp() {
            System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.darksky.net");

            WebElement locationButton = driver.findElement(By.xpath(" //*[@id=\"searchForm\"]/a[1]/img "));
            WebElement FeelsLike = driver.findElement(By.xpath("//span[@class='feels-like-text']") );

            locationButton.click();
            String lowTemp = FeelsLike.getText();


        }

    }

