package Class38_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement greenBtn =  driver.findElement(By.xpath("//input[@value=\"green\"]"));
        greenBtn.click();
        System.out.println(greenBtn.isSelected());

        WebElement blueBtn =  driver.findElement(By.xpath("//input[@value=\"blue\"]"));
        System.out.println(blueBtn.isSelected());
    }



}
