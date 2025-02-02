package Class41_ActionsClass_xPathSibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class a_xPathSiblinngsEg {
    public static void main(String[] args) {

        String url = "https://www.ebay.co.uk/itm/326343236332?_skw=collectable+prints&itmmeta=01JK3NT9P0MK20JQAXXC2NGZXP&hash=item4bfb929aec:g:A24AAOSwZ5pnOyzl&itmprp=enc%3AAQAJAAAA8CodCO1vSDjg2xNOt8By6oAFFnlWCmHK9PPKJyl3%2FZGZws9p2nwxI4EOemqpWbMOiW8gdwb5VIprWEm%2FsyCfx15uGyGunf7y%2BmRpEn19nZygJRt4RQITjVFpoabZumdzImRu%2FvucKMyLxxsXhWCEkTZ1V%2Fthu2oYPLZnoMt89fiZiLS2opmJdJi9F1oM18FlKVpW7xIViWXvNv03yHy3bS7eXRu783ldBvwtthGUn99rNm6EbvN%2F1XJGEfEciwG2p%2FV93pUWiNsW88SmMgTNwESxZSP0%2BnCtf8zvyeHBHXco4Wva2HTzzvKDeWaqSecLBA%3D%3D%7Ctkp%3ABFBMlpvp9Zhl";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);

        //Seller contact information
        WebElement sellerInfo = driver.findElement(By.xpath("//span[text()=\"Seller contact information\"]"));
        sellerInfo.click();

        //Phone
        WebElement phone = driver.findElement(By.xpath("//span[text()=\"Phone\"]"));
        System.out.println(phone.getText());

        //Phone Number
        WebElement phoneNumber = driver.findElement(By.xpath("//span[text()=\"Phone\"]/../following-sibling::div[1]"));
        System.out.println(phoneNumber.getText());
    }


}
