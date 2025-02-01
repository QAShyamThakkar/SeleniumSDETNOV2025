package Class40_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitEg2 {
    public static void main(String[] args) {

        String url = "https://www.minted.com/";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);

        WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"Email address\"]"));
        email.sendKeys("Test@gmail.com");


    }

}
