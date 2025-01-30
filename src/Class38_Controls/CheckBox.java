package Class38_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement option1 = driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
        WebElement option2 = driver.findElement(By.xpath("//input[@value=\"option-2\"]"));
        WebElement option3 = driver.findElement(By.xpath("//input[@value=\"option-3\"]"));

        if (!option1.isSelected()) {
            option1.click();
        }

        if (!option2.isSelected()) {
            option2.click();
        }

        if (!option3.isSelected()) {
            option3.click();
        }

    }

}
