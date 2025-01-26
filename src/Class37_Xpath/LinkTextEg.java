package Class37_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextEg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.co.uk/");

         //The text should be within anchor tag   eg <a> "text" </a>
//        driver.findElement(By.linkText("Daily Deals")).click();

            driver.findElement(By.partialLinkText("Deals")).click();

    }

}
