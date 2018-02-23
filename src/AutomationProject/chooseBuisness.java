package AutomationProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class chooseBuisness {
    public static void chooseBuisness(WebDriver driver) throws IOException, InterruptedException {
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       URL URLf= new URL();
       Assert.assertNotEquals(URLf.returnURL("URL"),driver.getCurrentUrl());
       // WebElement Data = (WebElement) driver.findElement(By.xpath("//*[@class='promo-item-cover']"));
         /*Select Buisness from the result of the select */
        WebElement Data = (WebElement) driver.findElement(By.xpath("//span[.='Scheffer Beer Garden']"));
        Data.click();
        Data = (WebElement) driver.findElement(By.xpath("//img[@src='https://buyme.co.il/files/packageImage1585473.jpg?1506245394']"));
       Data.click();
    }
}
