package Class36_HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayEG2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.co.uk/");

        Thread.sleep(2000);

        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");


    }

}
