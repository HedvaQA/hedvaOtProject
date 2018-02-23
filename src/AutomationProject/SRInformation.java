package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
/*Sender & Receiver information screen  */
public class SRInformation {

    public static void SRInformation(WebDriver driver) throws IOException, InterruptedException {
        /*For me the GiftCard */
        WebElement Data = (WebElement) driver.findElement(By.id("ember1043"));
        Data.clear();
        Data.sendKeys("Dear Mom And Dad");

        Data=(WebElement)driver.findElement(By.xpath("//*[@id='ember1045_chosen']"));
        Thread.sleep(3000);
        Data.click();
        List<WebElement> Erua = driver.findElements(By.className("active-result"));
        Erua.get(2).click();
        Data=(WebElement)driver.findElement(By.id("msg"));
        Data.clear();
        Data.sendKeys("תודה רבה על כל העזרה האהבה התמיכה והדאגה,\n" +
                "ועל זה שתמיד אתם כאן בשבילנו.\n" +
                "זו מתנה במיוחד בשבילכם ");



        Data=(WebElement)driver.findElement(By.name("fileUpload"));
        Data.sendKeys("C:\\Users\\or\\Pictures\\Saved Pictures\\Atardecer.jpg");
        Data=(WebElement) driver.findElement(By.className("btn-text"));
        Thread.sleep(3000);
        Data.click();
        Data = (WebElement) driver.findElement(By.xpath("//input[@data-parsley-mobile='mobile']"));
        Data.clear();
        Data.sendKeys("0508888888");
        Data = (WebElement) driver.findElement(By.id("resendReciver"));
        Data.clear();
        Data.sendKeys("0509999999");
        Data = (WebElement) driver.findElement(By.xpath("//*[@class='btn btn-theme btn-save']"));
        Data.click();
        Data=(WebElement) driver.findElement(By.xpath("//button[@data-target='#forgot-password']"));
        Data.submit();
    }

    }
