package Class37_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathEbayEg {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.co.uk/");

        WebElement advanceBtn = driver.findElement(By.xpath("//a[@class=\"gh-search-button__advanced-link\"]"));
        advanceBtn.click();

        Thread.sleep(5000);

        WebElement categoryDropDown = driver.findElement(By.xpath("//select[@aria-label=\"In this category\"]"));

        Select sc = new Select(categoryDropDown);
        sc.selectByVisibleText("Art");
//        sc.selectByValue("550");
//        sc.selectByIndex(1);


        WebElement searchBtn = driver.findElement(By.xpath("//button[@class=\"btn btn--primary\"]"));
        searchBtn.click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt=\"Paintings\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt=\"Wall art\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt=\"Georgia O'Keeffe 'Canyon with Crows' Collectible Modern Art Print Free Shipping - Image 1 of 4\"]")).click();

        Thread.sleep(2000);
        System.out.println("Heading: ");
        System.out.println(driver.findElement(By.xpath("//div[@id=\"mainContent\"]/div/div/h1/span")).getText());

        Thread.sleep(2000);
        System.out.println("TagName: ");
        System.out.println(driver.findElement(By.xpath("//div[@id=\"mainContent\"]/div/div/h1/span")).getTagName());
    }

}
