package Class41_ActionsClass_xPathSibling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class b_ActionsClass {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.ebay.co.uk";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);

        WebElement declineCookie = driver.findElement(By.xpath("//button[@id=\"gdpr-banner-decline\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", declineCookie);

//        =====================1. Hover Mouse ==============================


        WebElement homeBtn = driver.findElement(By.linkText("Home"));
        Actions actions = new Actions(driver);
        actions.moveToElement(homeBtn).build().perform();

        WebElement cookBtn = driver.findElement(By.linkText("Cook & dine"));
        cookBtn.click();
        Thread.sleep(2000);

//        //        =====================2. Scroll ==============================

        for (int i = 0; i < 5; i++) {
            actions.scrollByAmount(500, 500).build().perform();
            Thread.sleep(2000);
        }

        for (int i = 0; i < 5; i++) {
            actions.scrollByAmount(-500, -500).build().perform();
            Thread.sleep(2000);
        }

        // ========== 3. Keyboard Actions =========

        WebElement tablewareMenu = driver.findElement(By.xpath("//img[@alt=\"Tableware & serving\"]"));
        actions.keyDown(Keys.CONTROL).click(tablewareMenu).keyUp(Keys.CONTROL).build().perform();


    }

}
