package Class39_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement dropDown1 = driver.findElement(By.id("dropdowm-menu-1"));
        Select select1 = new Select(dropDown1);
        select1.selectByValue("python");

        WebElement dropDown2 = driver.findElement(By.id("dropdowm-menu-2"));
        Select select2 = new Select(dropDown2);
        select2.selectByVisibleText("Maven");

        //DropDown 3 - Select CSS (Homework)

    }

}
