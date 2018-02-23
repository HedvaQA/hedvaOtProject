package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class SearchGift {
    public static void SearchGift(WebDriver driver) throws IOException, InterruptedException {
//* choise Price*/

        WebElement Data = (WebElement) driver.findElement(By.xpath("//span[.='סכום']"));
        Thread.sleep(3000);
        Data.click();
        List<WebElement> price = driver.findElements(By.className("active-result"));
        price.get(2).click();

        /* choise area*/
        Data = driver.findElement(By.xpath("//span[.='אזור']"));
        Data.click();
        List<WebElement> Area = driver.findElements(By.className("active-result"));
        Area.get(3).click();

        /* choise Category*/
        Data = driver.findElement(By.xpath("//span[.='קטגוריה']"));
        Data.click();
        List<WebElement> Category = driver.findElements(By.className("active-result"));
        Category.get(4).click();
        Data = driver.findElement(By.xpath("//button[@type='submit']"));
        Data.click();


    }


        }






