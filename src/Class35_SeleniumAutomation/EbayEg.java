package Class35_SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayEg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("laptop");

        driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();

    }

}
