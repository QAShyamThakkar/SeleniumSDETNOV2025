package Class41_ActionsClass_xPathSibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class c_DragandDrop {
    public static void main(String[] args) {

        String url = "https://demo.automationtesting.in/Static.html";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);

        Actions actions = new Actions(driver);

        WebElement fromLocation = driver.findElement(By.id("angular")) ;
        WebElement toLocation = driver.findElement(By.id("droparea"));

        actions.dragAndDrop(fromLocation, toLocation).build().perform();


    }

}
