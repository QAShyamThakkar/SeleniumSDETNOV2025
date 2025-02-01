package Class40_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitEg1 {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);

        WebElement loadingLink = driver.findElement(By.linkText("Dynamic Loading"));
        loadingLink.click();

        WebElement example2Link = driver.findElement(By.partialLinkText("Example 1"));
        example2Link.click();

        WebElement startBtn = driver.findElement(By.xpath("//div[@id=\"start\"]/button"));
        startBtn.click();

        WebElement text = driver.findElement(By.xpath("//div[@id=\"finish\"]/h4"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(text));

        System.out.println(text.getText());


    }


}
